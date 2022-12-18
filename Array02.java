import java.util.Scanner;
public class Array02
{
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in);
         //步骤：
        // 1.创建一个 double 数组，大小 5
        double[] scores = new double[5];
        //2.循环输入
        //  scores.length 表示数组的大小/长度
        for(int i=0;i<scores.length;i++)
        {
            System.out.println("请输入第"+i+"个元素的值");
            scores[i]=myScanner.nextDouble();
        }
        //3.输出，遍历数组
        for(int i=0;i<scores.length;i++)
        {
            System.out.println("第"+i+"个元素的值="+scores[i]);
        }
    }
}
