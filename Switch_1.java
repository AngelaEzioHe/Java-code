import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;
public class Switch_1
{
    public static void main(String[] args)
    {
        System.out.println("输入一个字母(a-g)代表周一到周日：");
        Scanner myScanner = new Scanner(System.in);
        char letter = myScanner.next().charAt(0);
        switch(letter)
        {
            case 'a':
                System.out.println("今天星期一");
                break;
            case 'b':
                System.out.println("今天星期二");
                break;
            case 'c':
                System.out.println("今天星期三");
                break;
            case 'd':
                System.out.println("今天星期四");
                break;
            default:
                System.out.println("字符不正确，没有匹配上");
        }
    }
}
