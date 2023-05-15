package inputstream_;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * @Author: EzioHe
 * @Date: 2023/5/13 17:17
 */
public class FileInputStream_ {
    public static void main(String[] args) {

    }

    @Test
    public void readFile01() {
        String filePath = "d:\\hello.txt";
        int readData = 0;
        //字节数组
        byte[] buf = new byte[8]; //一次读取8个字符
        int readLen = 0;
        FileInputStream fileInputStream = null;
        try {
            //创建了 FileInputStream 对象，用于读取文件
            fileInputStream = new FileInputStream(filePath);
            //从该输入流读取一个字节的数据，如果没有输入可用，此方法将阻止
            //如何返回-1，表示读取完毕
            while ((readLen = fileInputStream.read(buf)) != -1) {
                System.out.print(new String(buf, 0, readLen));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭文件流，释放资源
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}