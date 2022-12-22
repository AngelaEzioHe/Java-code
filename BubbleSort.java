public class BubbleSort
{
    public static void main(String[] args)
    {
        int[]arr=new int[10];
        arr[1]=24;
        arr[2]=69;
        arr[3]=57;
        arr[4]=80;
        arr[5]=13;
        int temp;
        for (int j=1;j<=4;j++)
        {
            for(int i=1;i<=4;i++)
            {
                if(arr[i]>arr[i+1])
                {
                    temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
        for(int i=1;i<=5;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
