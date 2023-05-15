package reader;

import org.junit.Test;

import java.io.FileReader;
import java.io.IOException;

/**
 * @Author: EzioHe
 * @Date: 2023/5/15 11:18
 */
public class FileReader_ {
    public static void main(String[] args) {
        String filePath = "d:\\story.txt";
        FileReader fileReader = null;
        int data = ' ';
        //1.创建FileReader对象
        try {
            fileReader = new FileReader(filePath);
            //循环读取，使用read，单个字符读取
            while ((data =fileReader.read()) != -1) {
                System.out.println((char)data);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if(fileReader!=null){
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    @Test
    public void readFile01(){

    }
}
