package outputstream;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * @Author: EzioHe
 * @Date: 2023/5/14 21:53
 */
public class FileOutPutStream01 {
    public static void main(String[] args) {

    }

    @Test
    /**
     * 演示使用 FileOutPutStream 将数据写到文件中
     * 如果该文件不存在，则创建该文件
     */
    public void writeFile() {
        // 创建 FilePutPutStream 对象
        String filePath = "d:\\a.txt";
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(filePath,true);
            //写入一个字节
            //fileOutputStream.write('H');
            //写入字符串
            String str = "Hello,world!";
            //str.getBytes() 可以把 字符串->字节数组
            fileOutputStream.write(str.getBytes());
            fileOutputStream.write(str.getBytes(),0,str.length());
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
