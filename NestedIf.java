import java.util.Scanner;
public class NestedIf
{
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入该歌手的成绩");
        double score = myScanner.nextDouble();
        if(score > 8.0)
        {
            System.out.println("请输入姓别：");
            char gender = myScanner.next().charAt(0);
            if(gender == '男')
            {
                System.out.println("进入男子组");
            }
            else if(gender == '女')
            {
                System.out.println("进入女子组");
            }
            else
            {
                System.out.println("性别有误");
            }
        }
        else
        {
            System.out.println("sorry你被淘汰了");
        }
    }
}
