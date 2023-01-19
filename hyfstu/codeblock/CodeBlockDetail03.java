package hyfstu.codeblock;

public class CodeBlockDetail03 {
    public static void main(String[] args) {
        new BBB();
    }
}
class AAA{

    public AAA() {
        System.out.println("AA A()构造器被调用");
    }
}
class BBB extends AAA{
    {
        System.out.println("BBB的普通代码块...");
    }
    public BBB() {
        System.out.println("BBB()构造器被调用");
    }
}