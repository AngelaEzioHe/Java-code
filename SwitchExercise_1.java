/*
    使用switch把小写类型额char转换为大写。只转换a,b,c,d,e，其他的输出other
 */
import java.util.Scanner;
public class SwitchExercise_1
{
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("输入一个小写字母:");
        char letter = myScanner.next().charAt(0);
        switch(letter)
        {
            case 'a':
                System.out.println("A");
                break;
            case 'b':
                System.out.println("B");
                break;
            case 'c':
                System.out.println("C");
                break;
            case 'd':
                System.out.println("D");
                break;
            case 'e':
                System.out.println("E");
                break;
            default:
                System.out.println("other");
        }
    }
}
