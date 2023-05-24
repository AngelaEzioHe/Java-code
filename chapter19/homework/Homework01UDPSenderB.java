package homework;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * @Author: EzioHe
 * @Date: 2023/5/24 0:07
 */
@SuppressWarnings({"all"})
public class Homework01UDPSenderB {
    public static void main(String[] args) throws IOException {
        //1.创建 Data果然没Socket 对象，准备在 9998端口 发送和接收数据
        DatagramSocket socket = new DatagramSocket(9998);

        //2.将需要发送的数据装包到 DatagramPacket 对象中
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你的问题");
        String queation=scanner.next();
        byte[] data = queation.getBytes();
        DatagramPacket packet = new DatagramPacket(data, data.length, InetAddress.getByName("192.168.31.180"), 8888);
        socket.send(packet);

        //3.====接收A端回复的信息
        byte[] buf = new byte[64 * 1024];
        packet = new DatagramPacket(buf, buf.length);
        socket.receive(packet);
        int length = packet.getLength();//实际接收到的数据长度(长度不一定是64*1024)
        data = packet.getData();//接收到数据
        String s = new String(data, 0, length);
        System.out.println(s);

        //关闭资源
        socket.close();
        System.out.println("B端退出");
    }
}
