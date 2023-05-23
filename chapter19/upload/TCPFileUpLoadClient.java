package upload;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @Author: EzioHe
 * @Date: 2023/5/20 20:59
 * @客户端
 */
public class TCPFileUpLoadClient {
    public static void main(String[] args) throws Exception {
        //客户端连接服务端，得到socket对象
        Socket socket = new Socket(InetAddress.getLocalHost(), 8888);
        //创建读取磁盘文件的输入流
        String filePath="d:\\图片\\壁纸\\1.jpg";
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(filePath));
        //bytes就是文件的内容
        byte[] bytes = StreamUtils.streamToByteArray(bis);
        //通过socket获取到输出流，将bytes数据发送给服务端
        BufferedOutputStream bos = new BufferedOutputStream(socket.getOutputStream());
        bos.write(bytes); //将文件对应的字节数组的内容，写到数据通道
        bis.close();
        socket.shutdownOutput(); //设置写入数据的结束标志

        //接收从服务端回复的消息
        InputStream inputStream = socket.getInputStream();
        //使用StreamUtils的方法，直接将inputStream读取到的内容转成字符串
        String s = StreamUtils.streamToString(inputStream);
        System.out.println(s);

        //关闭相关的流
        bos.close();
        socket.close();
    }
}
