/*
    学生成绩大于60，输出合格；
    低于60分，输出不合格
 */
import java.util.Scanner;
public class SwitchExercise_2
{
    public static void main(String[] args)
    {
        System.out.println("输入学生成绩：");
        Scanner myScanner = new Scanner(System.in);
        int grade = myScanner.nextInt();
        switch((int)(grade / 60))
        {
            case 1:
                System.out.println("合格");
                break;
            case 0:
                System.out.println("不合格");
                break;
        }
    }
}
