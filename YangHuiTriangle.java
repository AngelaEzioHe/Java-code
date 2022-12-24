public class YangHuiTriangle
{
    public static void main(String[] args)
    {
        int[][] yanghui=new int[10][];
        for(int i=0;i< yanghui.length;i++)
        {
            yanghui[i]=new int[i+1];
            for(int j=0;j<yanghui[i].length;j++)
            {
                if(j==0 || j==yanghui[i].length-1)
                {
                    yanghui[i][j]=1;
                }
                else
                {
                    yanghui[i][j]=yanghui[i-1][j]+yanghui[i-1][j-1];
                }
            }
        }
        //输出杨辉三角
        for(int i=0;i< yanghui.length;i++)
        {
            for(int j=0;j<yanghui[i].length;j++)
            {
                System.out.printf(yanghui[i][j]+"\t");
            }
            System.out.println();
        }
    }
}