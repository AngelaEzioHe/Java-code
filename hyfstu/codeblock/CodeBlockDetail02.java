package hyfstu.codeblock;

public class CodeBlockDetail02 {
    public static void main(String[] args) {
        A a = new A();
    }
}
class A{
    private int n2=getN2();
    {
        System.out.println("A的普通代码块01");
    }
    private static int n1=getN1();
    static{
        System.out.println("A 静态代码块01");
    }
    public static int getN1(){
        System.out.println("getN1被调用");
        return 100;
    }
    public int getN2(){
        System.out.println("getN2 被调用");
        return 200;
    }
}