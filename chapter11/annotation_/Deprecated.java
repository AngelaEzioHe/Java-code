package annotation_;

/**
 * @author 何蛋
 * @version 1.0
 */
public class Deprecated {
    public static void main(String[] args) {
        A a = new A();
        a.hi();
        System.out.println(a.n1);
    }
}

@java.lang.Deprecated
class A {
    @java.lang.Deprecated
    public int n1 = 10;

    @java.lang.Deprecated
    public void hi() {

    }
}