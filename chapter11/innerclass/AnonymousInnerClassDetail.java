package innerclass;

/**
 * @Author: EzioHe
 * @Date: 2023/4/9 23:58
 */
public class AnonymousInnerClassDetail {
    public static void main(String[] args) {
        Outer05 outer05 = new Outer05();
        outer05.f1();
    }
}

class Person {
    public void hi() {
        System.out.println("Person hi()");
    }

    public void ok(String str){
        System.out.println("Person ok()"+str);
    }
}

class Outer05 {
    private int n1 = 99;

    public void f1() {
        Person p = new Person() {
            @Override
            public void hi() {
                System.out.println("匿名内部类重写了 hi 方法");
            }
        };
        p.hi();

        new Person() {
            @Override
            public void hi() {
                System.out.println("匿名内部类重写了 hi 方法,哈哈哈");
            }

            @Override
            public void ok(String str) {
                super.ok(str);
            }
        }.ok("小龙是傻逼");
    }
}