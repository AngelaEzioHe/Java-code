package socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @Author: EzioHe
 * @Date: 2023/5/19 0:27
 * @服务端，使用字符流方式
 */
@SuppressWarnings({"all"})
public class SocketTCP03Server {
    public static void main(String[] args) throws IOException {
        //1.在本机的 9999端口 监听，等待连接
        //  细节：要求在本机没有其他服务在监听9999
        //  细节：这个 ServerSocket 可以通过 accept() 返回多个 Socket[多个客户端连接服务器的并发]
        ServerSocket serverSocket = new ServerSocket(9999);
        System.out.println("服务端，在9999端口监听，等待连接..");
        //2.当没有客户端连接9999端口时，程序会阻塞，等待连接
        //  如果有客户端连接，则返回Socket对象，程序继续
        Socket socket = serverSocket.accept();
        System.out.println("服务器端socket=" + socket.getClass());
        //3.通过 socket.getInputStream() 读取客户端写入到数据通道的数据
        InputStream inputStream = socket.getInputStream();
        //4.IO读取,使用字符流,使用 InputStreamReade() 将 inputStream 转成字符流
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
        String s = bufferedReader.readLine();
        System.out.println(s);
        //5.获取 socket 相关联的输出流
        OutputStream outputStream = socket.getOutputStream();
        //使用字符输出流的方式回复信息
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("hello,client(字符流)");
        bufferedWriter.newLine(); //表示回复内容的结束
        bufferedWriter.flush(); //需要手动刷新
        //6.关闭流和socket
        bufferedWriter.close();
        bufferedReader.close();
        socket.close();
        serverSocket.close();
    }
}