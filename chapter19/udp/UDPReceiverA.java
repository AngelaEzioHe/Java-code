package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @Author: EzioHe
 * @Date: 2023/5/23 23:38
 */
public class UDPReceiverA {
    public static void main(String[] args) throws IOException {
        //1.创建一个 DatagramSocket 对象，准备在9999端口接收数据
        DatagramSocket socket = new DatagramSocket(9999);
        //2.构建一个 DatagramPacket 对象，准备接收数据
        byte[] buf = new byte[64 * 1024];
        DatagramPacket packet = new DatagramPacket(buf, buf.length);
        //3.调用 接收方法,将通过网络传输的 DatagramPacket 对象，填充到 packet 对象
        //当有数据包发送到 本机的9999端口 时，就会接收到该数据;
        //如果没有数据包发送到 本机的9999端口 ，就会阻塞等待
        System.out.println("接收端A 等待接收数据...");
        socket.receive(packet);
        //4.可以把 packet 进行拆包，取出数据，并显示。
        int length = packet.getLength();//实际接收到的数据长度(长度不一定是64*1024)
        byte[] data = packet.getData();//接收到数据
        String s = new String(data, 0, length);
        System.out.println(s);

        //====回复数据给B端
        data = "好的明天见".getBytes();
        packet = new DatagramPacket(data, data.length, InetAddress.getByName("192.168.31.180"), 9998);
        socket.send(packet);

        //5.关闭资源
        socket.close();
        System.out.println("A端退出");
    }
}
