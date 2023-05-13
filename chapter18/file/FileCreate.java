package file;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/**
 * @Author: EzioHe
 * @Date: 2023/5/12 19:04
 * @注释: 创建文件
 */
public class FileCreate {
    public static void main(String[] args) {

    }
    //方式1 new File(String pathname)
    @Test
    public void create01(){
        String filePath="D:\\news1.txt";
        File file = new File(filePath);
        try {
            file.createNewFile();
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //方式2 new File(File parent,String child) 根据父目录文件+子路径创建
    @Test
    public void create02(){
        File parentFile = new File("d:\\");
        String fileName="news2.txt";
        File file = new File(parentFile, fileName);
        try {
            file.createNewFile();
            System.out.println("创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //方式3
    @Test
    public void create03(){
        String parentPath="d:\\";
        String fileName="news3.txt";
        File file = new File(parentPath, fileName);
        try {
            file.createNewFile();
            System.out.println("创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
