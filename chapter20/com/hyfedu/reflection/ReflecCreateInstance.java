package com.hyfedu.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Author: EzioHe
 * @Date: 2023/8/15 10:42
 */
public class ReflecCreateInstance {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        //1.先获取到User类的Class对象
        Class<?> userClass = Class.forName("com.hyfedu.reflection.User");

        //2.通过public的无参构造器创建实例
        Object o = userClass.newInstance();
        System.out.println(o);

        //3.通过public的有参构造器创建实例
        /*
            constructor 对象就是
            public User(String name) {
                this.name = name;
            }
        */
        Constructor<?> constructor = userClass.getConstructor(String.class);
        Object hyf = constructor.newInstance("hyf");
        System.out.println("hyf="+hyf);

        //4.通过非public的有参构造器创建实例
        //(1)得到private的构造器对象
        Constructor<?> constructor1 = userClass.getDeclaredConstructor(int.class, String.class);
        //(2)创建实例
        constructor1.setAccessible(true);
        Object user2 = constructor1.newInstance(100, "张三丰");
        System.out.println("user2="+user2);
    }
}

class User {
    private int age=10;
    private String name="何宇飞大帅逼";

    public User() {

    }

    public User(String name) {
        this.name = name;
    }

    private User(int age, String name) {
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User[" +
                "age=" + age +
                ", name='" + name + '\'' +
                ']';
    }
}