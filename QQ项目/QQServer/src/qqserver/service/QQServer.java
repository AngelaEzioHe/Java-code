package qqserver.service;

import qqcommon.Message;
import qqcommon.MessageType;
import qqcommon.User;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

/**
 * @Author: EzioHe
 * @Date: 2023/5/31 22:46
 * @这是服务器，在监听9999端口，等待客户端的连接，并保持通讯
 */
public class QQServer {
    private ServerSocket ss = null;

    //创建一个集合，存放多个用户，如果是这些用户登录，就认为是合法
    private static HashMap<String, User> validUsers = new HashMap<>();

    //在静态代码块儿，初始化 validUsers
    static {
        validUsers.put("100", new User("100", "111111"));
        validUsers.put("200", new User("200", "222222"));
        validUsers.put("300", new User("300", "333333"));
        validUsers.put("400", new User("400", "444444"));
        validUsers.put("至尊宝", new User("至尊宝", "555555"));
        validUsers.put("瑶", new User("瑶", "666666"));
        validUsers.put("蔡文姬", new User("蔡文姬", "777777"));

    }

    //验证用户是否有效的方法
    private boolean checkUser(String userId, String pwd) {
        User user = validUsers.get(userId);
        if (user == null) { //userId不存在
            return false;
        }
        if (!user.getPasswd().equals(pwd)) { //id正确，密码错误
            return false;
        }
        return true;
    }

    public QQServer() {
        //注意：端口可以写配置文件
        try {
            System.out.println("服务端在9999端口监听...");
            ss = new ServerSocket(9999);

            while (true) { // 当和某个客户端建立连接后，会继续监听，因此用 while
                Socket socket = ss.accept();
                //得到 socket 关联的对象输入流
                ObjectInputStream ois =
                        new ObjectInputStream(socket.getInputStream());
                //得到 socket 关联的对象输出流
                ObjectOutputStream oos =
                        new ObjectOutputStream(socket.getOutputStream());

                User u = (User) ois.readObject(); //读取客户端发送的User对象
                //创建一个 Message 对象，准备回复客户端
                Message message = new Message();
                //验证用户 （单独的方法）
                if (checkUser(u.getUserId(), u.getPasswd())) { //合法
                    message.setMesType(MessageType.MESSAGE_LOGIN_SUCCEED);
                    //将 Message 对象回复
                    oos.writeObject(message);
                    //创建一条线程，和客户端保持通信，该线程需要持有 socket 对象
                    ServerConnectClientThread serverConnectClientThread =
                            new ServerConnectClientThread(socket, u.getUserId());
                    //启动该线程
                    serverConnectClientThread.start();
                    //把该线程对象，放入到一个集合当中，进行管理
                    ManageClientThreads.addClientThread(u.getUserId(), serverConnectClientThread);

                } else { // 失败
                    System.out.println("用户id=" + u.getUserId() + " pwd=" + u.getPasswd() + "验证失败");
                    message.setMesType(MessageType.MESSAGE_LOGIN_FAIL);
                    oos.writeObject(message);
                    //关闭 socket
                    socket.close();

                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            //如果服务端退出 while 循环，说明服务器端不再监听，因此需要关闭资源
            try {
                ss.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}