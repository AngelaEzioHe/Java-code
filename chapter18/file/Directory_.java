package file;

import org.junit.Test;

import java.io.File;

/**
 * @Author: EzioHe
 * @Date: 2023/5/12 20:16
 */
public class Directory_ {
    public static void main(String[] args) {

    }

    //判断 d:\\news.txt 是否存在，如果存在就删除
    @Test
    public void m1(){
        String filePath="d:\\\\news1.txt";
        File file = new File(filePath);
        if(file.exists()){
            if(file.delete()){
                System.out.println("删除成功");
            }else {
                System.out.println("删除失败");
            }
        }else {
            System.out.println("改文件不存在");
        }
    }

    //判断 d:\\demo\\a\\b\\c 目录是否存在，如果存在提示存在，否则就创建
    @Test
    public void m2(){
        String directoryPath="d:\\demo\\a\\b\\c";
        File file = new File(directoryPath);
        if(file.exists()){
            System.out.println(directoryPath+" 存在");
        }else {
            if(file.mkdirs()){
                System.out.println(directoryPath+" 创建成功");
            }else {
                System.out.println(directoryPath+" 创建失败");
            }
        }
    }
}
