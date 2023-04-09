package innerclass;

/**
 * @Author: EzioHe
 * @Date: 2023/4/9 23:00
 */
public class AnonymousInnerClass {
    public static void main(String[] args) {
        Outer04 outer04 = new Outer04();
        outer04.method();
    }
}

class Outer04 {
    private int n1 = 10;

    public void method() {
        /*
            基于接口的匿名内部类
            1.需求：想使用接口IA，并创建对象
            2.传统方式：写一个类，实现该接口，并创建对象
            3.需求：Tiger/Dog 类只用一次，之后不再使用
            4.方案：使用匿名内部类
            5.tiger 的编译类型: IA
            6.tiger 的运行类型: 匿名内部类
         */
//        IA tiger = new Tiger();
//        tiger.cry();

        IA tiger = new IA() {
            @Override
            public void cry() {
                System.out.println("老虎叫唤...");
            }
        };

        System.out.println("tiger的运行类型=" + tiger.getClass());
        tiger.cry();

        //演示基于类的匿名内部类
        /*
            1.father 编译类型 Father
            2.father 运行类型 Outer04$2
         */
        Father father = new Father("jack") {
            @Override
            public void test() {
                System.out.println("匿名内部类重写了test方法");
            }
        };
        System.out.println("father对象的运行类型=" + father.getClass());
        father.test();

        Animal animal = new Animal() {
            @Override
            void eat() {
                System.out.println("小狗吃骨头");
            }
        };
        animal.eat();
    }
}

interface IA {
    public void cry();
}

//class Tiger implements IA {
//
//    @Override
//    public void cry() {
//        System.out.println("老虎叫唤");
//    }
//}

//class Dpg implements IA {
//
//    @Override
//    public void cry() {
//        System.out.println("小狗汪汪叫");
//    }
//}

class Father {
    public Father(String name) {

    }

    public void test() {

    }
}

abstract class Animal {
    abstract void eat();
}