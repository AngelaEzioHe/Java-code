package innerclass;

/**
 * @Author: EzioHe
 * @Date: 2023/4/9 21:55
 */
public class LocalInnerClass {
    public static void main(String[] args) {
        Outer02 outer02 = new Outer02();
        outer02.m1();
    }
}

class Outer02 {
    private int n1 = 100;

    private void m2() {
        System.out.println("Outer02 m2()");
    }

    public void m1() {
        //局部内部类是定义在外部类的局部位置，通常在方法
        class Inner02 {
            //k可以访问外部类的所有成员，包含私有的
            public void f1() {
                System.out.println("n1=" + n1);
                m2();
            }
        }
        Inner02 inner02 = new Inner02();
        inner02.f1();
    }

    {
        class Inner03{

        }
    }
}