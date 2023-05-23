package homework;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @Author: EzioHe
 * @Date: 2023/5/23 23:38
 */
@SuppressWarnings({"all"})
public class HomeworkUDPReceiverA {
    public static void main(String[] args) throws IOException {
        //1.创建一个 DatagramSocket 对象，准备在9999端口接收数据
        DatagramSocket socket = new DatagramSocket(8888);

        //2.构建一个 DatagramPacket 对象，准备接收数据
        byte[] buf = new byte[64 * 1024];
        DatagramPacket packet = new DatagramPacket(buf, buf.length);

        //3.调用 接收方法,将通过网络传输的 DatagramPacket 对象，填充到 packet 对象
        System.out.println("接收端等待接收问题...");
        socket.receive(packet);

        //4.可以把 packet 进行拆包，取出数据，并显示。
        int length = packet.getLength();//实际接收到的数据长度(长度不一定是64*1024)
        byte[] data = packet.getData();//接收到数据
        String s = new String(data, 0, length);
        //判断接收到的信息是什么
        String answer="";
        if("四大名著是什么".equals(s)){
            answer="四大名著：《红楼梦》、《三国演义》、《水浒传》、《西游记》";
        }else {
            answer="what?";
        }

        //====回复数据给B端
        data = answer.getBytes();
        packet = new DatagramPacket(data, data.length, InetAddress.getByName("192.168.31.180"), 9998);
        socket.send(packet);

        //5.关闭资源
        socket.close();
        System.out.println("A端退出");
    }
}
