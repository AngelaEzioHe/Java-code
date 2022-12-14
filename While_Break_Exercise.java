public class While_Break_Exercise
{
    public static void main(String[] args)
    {
        System.out.println("某人有100000元，每经过一次路口交一次费。现金>50000时，每次交5%，现金<=50000时，每次交1000.计算可以经过多少次路口");
        int k=0;
        double money = 100000;
        while(true)
        {
            if (money>50000)
            {
                money *= 0.95;
                k++;
            }
            else if (money>=1000 /* && money<=50000*/ )
            {
                money-=1000;
                k++;
            }
            else//(money<1000)
            {
                break;
            }
        }
        System.out.println("可以经过" + k + "个路口");
    }
}
