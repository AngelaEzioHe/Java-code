package qqserver.service;

import qqcommon.Message;
import qqcommon.MessageType;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 * @Author: EzioHe
 * @Date: 2023/5/31 23:20
 * @该类的一个对象对应的对象和某个客户端保持一个通信
 */
public class ServerConnectClientThread extends Thread {
    private Socket socket;
    private String userId; //连接到服务端的用户Id

    public ServerConnectClientThread(Socket socket, String userId) {
        this.socket = socket;
        this.userId = userId;
    }

    @Override
    public void run() { //这里线程处于 run 状态， 可以发送/接收消息
        while (true) {
            try {
                System.out.println("服务端和客户端" + userId + "保持通信，读取数据...");
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                Message message = (Message) ois.readObject();
                //后面会使用message，根据message的类型，做相应地业务处理
                if (message.getMesType().equals(MessageType.MESSAGE_GET_ONLINE_FRIEND)) {
                    //客户端要在线用户列表
                    System.out.println(message.getSender() + " 要在线用户列表");
                    String onlineUser = ManageClientThreads.getOnlineUser();
                    //构建一个Message对象
                    Message message2 = new Message();
                    message2.setMesType(MessageType.MESSAGE_RETURN_ONLINE_FRIEND);
                    message2.setContent(onlineUser);
                    message2.setGetter(message.getSender());
                    //写入数据通道，返回给客户端
                    ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());
                    oos.writeObject(message2);
                } else if (message.getMesType().equals(MessageType.MESSAGE_CLIENT_EXIT)) {
                    System.out.println(message.getSender()+" 退出");
                    //将这个客户端对应的线程从集合中移除
                    ManageClientThreads.removeServerConnectClientThread(message.getSender());
                    socket.close(); //关闭连接
                    //退出线程
                    break;
                } else {
                    System.out.println("其他类型的message暂时不处理");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}