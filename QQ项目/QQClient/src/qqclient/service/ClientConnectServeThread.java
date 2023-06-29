package qqclient.service;

import qqcommon.Message;
import qqcommon.MessageType;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.Socket;

/**
 * @Author: EzioHe
 * @Date: 2023/5/30 23:29
 */
public class ClientConnectServeThread extends Thread {
    //该线程需要持有 Socket
    private Socket socket;

    public ClientConnectServeThread(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {
        //因为 Thread 需要后台和服务端通信，因此用 while 循环
        while (true) {
            try {
                System.out.println("客户端线程，等待从服务器端发送消息");
                ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                Message message = (Message) ois.readObject(); //如果服务器没有发送 Message 对象
                //判断 Message 类型，做相应地处理
                if (message.getMesType().equals(MessageType.MESSAGE_RETURN_ONLINE_FRIEND)) {
                    //取出在线列表信息并显示
                    String[] onlineUsers = message.getContent().split(" ");
                    System.out.println("\n==============当前在线用户列表==============");
                    for (int i = 0; i < onlineUsers.length; i++) {
                        System.out.println("用户：" + onlineUsers[i]);
                    }
                } else {
                    System.out.println("是其他类型的Message，暂时不处理...");
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    //为了更方便地得到 Socket
    public Socket getSocket() {
        return socket;
    }
}