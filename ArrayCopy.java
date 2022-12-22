//将int[] arr1={10,20,30}拷贝到arr2数组，要求数据空间是独立的
public class ArrayCopy
{
    public static void main(String[] args)
    {
        int[] arr1={10,20,30};
        int[] arr2=new int[arr1.length];
        for(int i=0;i<arr1.length;i++)
        {
            arr2[i]=arr1[i];
        }
    }
}
