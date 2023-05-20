package socket;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * @Author: EzioHe
 * @Date: 2023/5/20 15:55
 * @客户端，发送"Hello,server"给服务器端
 */
public class SocketTCP01Client {
    public static void main(String[] args) throws IOException {
        //1.连接服务器(ip,端口)
        //解读：我要连接 InetAddress.getLocalHost() 这个主机的 9999端口
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("客户端socket返回=" + socket.getClass());
        //2.连接上后，生成Socket，通过 socket.getOutputStream() 得到和socket对象关联的输出流对象
        OutputStream outputStream = socket.getOutputStream();
        //3.通过输入流，写入数据到数据通道
        outputStream.write("hello,server".getBytes());
        //4.关闭流对象和socket，必须关闭
        outputStream.close();
        socket.close();
        System.out.println("客户端退出");
    }
}
