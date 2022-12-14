import java.util.Scanner;
public class for_pyramid
{
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("输入金字塔层数：");
        int n = myScanner.nextInt();
        System.out.println("实心金字塔：");
        for(int i=1;i<=n;i++)
        {
            for(int j=(n-i);j>=0;j--)
            {
                System.out.printf(" ");
            }
            for(int j=1;j<=(2*i-1);j++)
            {
                System.out.printf("*");
            }
            for(int j=(n-i);j>=0;j--)
            {
                System.out.printf(" ");
            }
            System.out.printf("\n");
        }
        System.out.println("空心金字塔：");
        for(int i=1;i<n;i++)//先输出除了最后一行的前面(n-1)行
        {
            for(int k=1;k<=(n-i);k++)//先输出每一行前的空格
            {
                System.out.printf(" ");
            }
            for(int j=1;j<=(2*i-1);j++)//当前行的第一个位置和最后一个位置输出*其他位置输出空格
            {
                if(j==1 || j==(2*i-1))
                {
                    System.out.printf("*");
                }
                else
                {
                    System.out.printf(" ");
                }
            }
            System.out.println("");
        }
        //输出最后的一行(全是*)
        for(int i=1;i<=(2*n-1);i++)
        {
            System.out.printf("*");
        }
    }
}
