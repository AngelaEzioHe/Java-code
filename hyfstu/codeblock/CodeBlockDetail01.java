package hyfstu.codeblock;

public class CodeBlockDetail01 {
    public static void main(String[] args) {
        AA aa = new AA();
        System.out.println(Cat.n1);
    }
}
class Cat{
    public static int n1=999;
    static {
        System.out.println("Cat 的静态代码1被执行..");
    }
}
class BB{
    static {
        System.out.println("BB的静态代码1被执行..");
    }
}
class AA extends BB{
    static {
        System.out.println("AA的静态代码1被执行..");
    }
}
