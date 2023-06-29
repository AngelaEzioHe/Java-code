package qqclient.service;

import qqcommon.Message;
import qqcommon.MessageType;
import qqcommon.User;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @Author: EzioHe
 * @Date: 2023/5/30 22:47
 * @该类完成用户登录注册验证和用户注册等功能
 */
public class UserClientService {
    //可能在其他地方要使用 User 信息，因此做成成员属性
    private User u = new User();
    //因为 Socket 在其他地方也可能使用，因此做出属性
    private Socket socket;

    //根据 userId 和 pwd 到服务端验证该用户是否合法
    public boolean checkUser(String userId, String pwd) {
        boolean b = false;
        //创建 User 对象
        u.setUserId(userId);
        u.setPasswd(pwd);
        //连接服务端，发送u对象
        try {
            //连接到服务器
            socket = new Socket(InetAddress.getByName("192.168.31.180"), 9999);
            //得到 ObjectOutputStream 对象
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(u); //发送User 对象

            //读取送服务端回复的 Message 对象
            ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
            Message ms = (Message) ois.readObject();

            if (ms.getMesType().equals(MessageType.MESSAGE_LOGIN_SUCCEED)) { //登录成功
                //创建一个和服务端保持通信的线程 -> 创建一个类 ClientConnectServeThread
                ClientConnectServeThread clientConnectServeThread = new ClientConnectServeThread(socket);
                //启动客户端的线程
                clientConnectServeThread.start();
                //为了后面的客户端的扩展，我们将线程放入到集合管理
                ManageClientConnectServerThread.addClientConnectServerThread(userId, clientConnectServeThread);

                b = true;
            } else { //如果登陆失败，我们就不能启动和服务器通信的线程,关闭 socket
                socket.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return b;
    }

    //向服务器端请求在线用户列表
    public void onlineFriendList() {
        //发送一个 Message ，类型 MESSAGE_GET_ONLINE_FRIEND
        Message message = new Message();
        message.setMesType(MessageType.MESSAGE_GET_ONLINE_FRIEND);
        message.setSender(u.getUserId());

        //发送给服务器
        try {
            //从管理线程的集合中，通过 userId，得到这个线程对象
            ClientConnectServeThread clientConnectServeThread =
                    ManageClientConnectServerThread.getClientConnectServeThread(u.getUserId());
            //通过这个线程得到关联的 socket
            Socket socket = clientConnectServeThread.getSocket();
            //得到当前线程的 Socket 对应的 ObjectOutputStream 对象
            ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            oos.writeObject(message); //发送一个 Message 对像，向服务端要求在线用户列表
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //编写方法，退出客户端，并给服务端发送一个退出系统的 message 对象
    public void logout() {
        Message message = new Message();
        message.setMesType(MessageType.MESSAGE_CLIENT_EXIT);
        message.setSender(u.getUserId()); //一定要指定是我是哪个客户端

        //发送message
        try {
            //ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
            ObjectOutputStream oos =
                    new ObjectOutputStream(ManageClientConnectServerThread.getClientConnectServeThread(u.getUserId()).getSocket().getOutputStream());
            oos.writeObject(message);
            System.out.println(u.getUserId() + " 退出系统");
            System.exit(0);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}