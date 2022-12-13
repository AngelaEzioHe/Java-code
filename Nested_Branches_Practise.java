import java.util.Scanner;
public class Nested_Branches_Practise
{
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("输入月份和年龄：");
        int month = myScanner.nextInt();
        int age = myScanner.nextInt();
        if(month >=4 && month <= 10)
        {
            if(age >= 18 && age <= 60)
            {
                System.out.println("票价60");
            }
            else if(age < 18)
            {
                System.out.println("票价30");
            }
            else
            {
                System.out.println("票价20");
            }
        }
        else
        {
            if(age >= 18 && age <= 60)
            {
                System.out.println("票价40");
            }
            else
            {
                System.out.println("票价20");
            }
        }
    }
}
