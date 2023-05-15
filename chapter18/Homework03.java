import org.junit.Test;

import java.io.*;
import java.util.Properties;

/**
 * @Author: EzioHe
 * @Date: 2023/5/16 0:25
 */
public class Homework03 {
    public static void main(String[] args) throws IOException {
        String filePath="src\\dog.properties";
        Properties properties = new Properties();
        properties.load(new FileReader(filePath));
        //properties.list(System.out);
        String name = properties.getProperty("name");
        int age = Integer.parseInt(properties.getProperty("age"));
        String color = properties.getProperty("color");

        Dog dog = new Dog(name, age, color);
        System.out.println("===Dog信息===");
        System.out.println(dog);
        
        //将创建的 Dog 对象，序列化到文件 dog.dat 文件
        String serFilePath="d:\\dog.dat";
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(serFilePath));
        oos.writeObject(dog);
        oos.close();
        System.out.println("dog对象序列化完成~~~");
    }
}
 class Dog implements Serializable {
    private String name;
    private int age;
    private String color;

     public Dog(String name, int age, String color) {
         this.name = name;
         this.age = age;
         this.color = color;
     }

     @Override
     public String toString() {
         return "Dog{" +
                 "name='" + name + '\'' +
                 ", age=" + age +
                 ", color='" + color + '\'' +
                 '}';
     }
 }