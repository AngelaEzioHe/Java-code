import java.util.Scanner;
public class If01 
{
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);
        while(1 > 0)
        {
            System.out.println("请输入年龄：");
            int age = myScanner.nextInt();
            if(age > 18)
            {
                System.out.println("你已经成年，要为自己的行为负责");
            }
            System.out.println("程序继续...");
        }

    }    
}
