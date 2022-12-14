public class BreakExercise1
{
    public static void main(String[] args)
    {
        System.out.println("1-100以内的数字求和，求出当和第一次大于20的当前数：");
        int sum = 0;
        for(int i=1;i<=100;i++)
        {
            sum+=i;
            if(sum>20)
            {
                System.out.println(i);
                break;
            }
        }
    }
}
