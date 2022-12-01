import java.util.Scanner;
public class Input
{
    public static void main(String[] args)
    {
        //接收用户的输入
        //1.引入Scanner所在的包
        //2.创建 Scanner 对象

        Scanner myScanner = new Scanner(System.in);
        //3.接收用户输入
        System.out.println("请输入名字");
        String name = myScanner.next(); //接收用户输入
        System.out.println("请输入年龄");
        int age = myScanner.nextInt(); //接收用户输入
        System.out.println("请输入薪水");
        double sal = myScanner.nextDouble(); //接收用户输入
        System.out.println("人的信息如下");
        System.out.println("名字：" + name +" 年龄：" + age +" 薪水：" +sal);
    }    
}
