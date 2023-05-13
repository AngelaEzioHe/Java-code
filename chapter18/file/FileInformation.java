package file;

import org.junit.Test;

import java.io.File;

/**
 * @Author: EzioHe
 * @Date: 2023/5/12 19:50
 */
public class FileInformation {
    public static void main(String[] args) {

    }
    //获取文件信息
    @Test
    public void info(){
        //先创建文件对象
        File file = new File("d:\\Hexo-blog\\blog-demo\\db.json");
        //调用相应地方法得到对应信息
        System.out.println("文件名字="+file.getName());
        System.out.println("文件绝对路径="+file.getAbsoluteFile());
        System.out.println("文件的父级目录="+file.getParentFile());
        System.out.println("文件大小（字节）="+file.length());
        System.out.println("文件是否存在="+file.exists());
        System.out.println("是不是一个文件="+file.isFile());
        System.out.println("是不是一个目录="+file.isDirectory());

    }
}
