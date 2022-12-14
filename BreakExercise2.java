import java.util.Scanner;
public class BreakExercise2
{
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);
        String name;
        int password;
        for(int i=3;i>0;i--)
        {
            System.out.println("输入用户名和密码：");
            name = myScanner.next();
            password = myScanner.nextInt();
            if(name.equals("丁真") && password == 666)
            {
                System.out.println("登录成功");
                break;
            }
            else
            {
                System.out.println("还有"+(i-1)+"次机会");
            }
        }
    }
}
