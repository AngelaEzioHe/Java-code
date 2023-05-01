package customGeneric_;

import java.util.ArrayList;

/**
 * @Author: EzioHe
 * @Date: 2023/4/28 20:38
 * @泛型方法的使用
 */
public class CustomMethodGeneric {
    public static void main(String[] args) {
        Car car = new Car();
        car.fly("宝马", 100); //调用方法时，编译器会确认类型
        System.out.println("=======");
        car.fly(300,100.1);

        Fish<String, ArrayList> fish = new Fish<>();
        fish.hello(new ArrayList(),11.3f);
    }
}

class Car { //普通类
    public void run() { //普通方法

    }

    public <T, R> void fly(T t, R r) { //泛型方法
        System.out.println(t.getClass());
        System.out.println(r.getClass());
    }
}

class Fish<T, R> { //泛型类
    public void run() { //普通方法

    }

    public <U, M> void eat(U u, M m) { //泛型方法

    }

    public <K> void hello(R r, K k) {
        System.out.println(r.getClass());
        System.out.println(k.getClass());
    }
}