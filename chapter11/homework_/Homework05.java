package homework_;

/**
 * @author 何蛋
 * @version 1.0
 */
public class Homework05 {
    public static void main(String[] args) {
        new A().f1();
    }
}

class A {
    private String NAME="Hello";
    public void f1() {
        class B {
            private final String NAME = "hyf";

            public void show() {
                System.out.println("NAME=" + NAME+A.this.NAME);
            }
        }
        B b = new B();
        b.show();
    }
}