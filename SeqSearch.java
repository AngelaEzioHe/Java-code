import java.util.Scanner;
public class SeqSearch
{
    public static void main(String[] args)
    {
        Scanner myScanner=new Scanner(System.in);
        String[]names={"狮王","鹰王","龙王","蝠王"};
        System.out.println("输入需要查找的名字：");
        String FindName=myScanner.next();
        int index=-1;
        for(int i=0;i<names.length;i++)
        {
            if(FindName.equals(names[i]))
            {
                System.out.println("恭喜你找到"+FindName);
                System.out.println("下标为"+i);
                break;
            }
        }
        if(index==-1) //for内没有进入到if语句
        {
            System.out.println("没有找到");
        }
    }
}
