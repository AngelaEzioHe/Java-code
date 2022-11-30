public class ForceConvert
{
    public static void main(String[] args)
    {
        int n1 = (int)1.9;
        System.out.println("n1=" + n1); //精度损失
        int n2 = 2000;
        byte b1 = (byte)n2;
        System.out.println("b1=" + b1); //会有溢出
        int x = (int)(10*3.5 + 6*1.5);
        System.out.println(x);
        int m = 100;
        char c3 = (char)m;
        System.out.println(c3);
    }    
}