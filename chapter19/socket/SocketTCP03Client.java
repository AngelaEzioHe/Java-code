package socket;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @Author: EzioHe
 * @Date: 2023/5/20 15:55
 * @客户端，发送"Hello,server"给服务器端,使用字符流
 */
@SuppressWarnings({"all"})
public class SocketTCP03Client {
    public static void main(String[] args) throws IOException {
        //1.连接服务器(ip,端口)
        //解读：我要连接 InetAddress.getLocalHost() 这个主机的 9999端口
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("客户端socket返回=" + socket.getClass());
        //2.连接上后，生成Socket，通过 socket.getOutputStream() 得到和socket对象关联的输出流对象
        OutputStream outputStream = socket.getOutputStream();
        //3.通过输出流，写入数据到数据通道,使用字符流
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("hello,server(字符流)");
        bufferedWriter.newLine(); //插入一个换行符，表示写入内容结束。要求对方使用readLine()方式来读取！！！
        bufferedWriter.flush(); //如果使用字符流，需要手动刷新，否则数据不会写入到数据通道
        //4.获取和 我创可贴 相关联的输入流，读取数据(字符)并显示
        InputStream inputStream = socket.getInputStream();
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String s = bufferedReader.readLine();
        System.out.println(s);
        //5.关闭流对象和socket，必须关闭
        bufferedReader.close(); // 关闭外层流
        bufferedWriter.close();
        socket.close();
        System.out.println("客户端退出");
    }
}
