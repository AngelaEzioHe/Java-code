package homework;

import upload.StreamUtils;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

/**
 * @Author: EzioHe
 * @Date: 2023/5/24 23:27
 */
public class Homework02Client {
    public static void main(String[] args) throws Exception {
        //1.接收用户输入，指定下载文件名
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入下载文件名");
        String downloadFileName = scanner.next();

        //2.客户端连接服务端，准备发送
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);

        //3.获取和Socket 关联的输出流
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write(downloadFileName.getBytes());
        //设置写入结束标志
        socket.shutdownOutput();

        //4.读取服务端返回的文件(字节数据)
        BufferedInputStream bis = new BufferedInputStream(socket.getInputStream());
        byte[] bytes = StreamUtils.streamToByteArray(bis);

        //5.得到一个输出流，准备将 bytes 写入磁盘文件
        String filePath="d:\\"+downloadFileName+".mp3";
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(filePath));
        bos.write(bytes);

        //6.关闭相关的资源
        bos.close();
        bis.close();
        socket.close();
        outputStream.close();
        System.out.println("客户端下载完毕，正在退出...");
    }
}
