package outputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author: EzioHe
 * @Date: 2023/5/14 22:28
 */
public class FileCopy {
    public static void main(String[] args) {
        /**
         * 完成文件拷贝，将 d:\\a.txt 拷贝到 c:\\
         * 1.创建的文件的输入流将文件读入到程序
         * 2.创建文件的输出流，将读取到的文件
         */
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        String srcfilePath = "d:\\a.txt";
        String destfilePath = "d:\\a1.txt";
        try {
            fileInputStream = new FileInputStream(srcfilePath);
            fileOutputStream = new FileOutputStream(destfilePath);
            //定义一个字节数组，提高读取效果
            byte[] buf = new byte[1024];
            int readLen = 0;
            while ((readLen = fileInputStream.read(buf)) != -1) {
                //边读边写
                fileOutputStream.write(buf,0,readLen);
            }
            System.out.println("拷贝成功");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fileInputStream != null) {
                    fileInputStream.close();
                }
                if (fileOutputStream != null) {
                    fileOutputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}