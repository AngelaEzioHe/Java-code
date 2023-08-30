package com.hyfedu.reflection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author: EzioHe
 * @Date: 2023/8/30 15:44
 */
public class ReflecAccessMethod {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        //1.得到 BOSS 类对应的 Class 对象
        Class<?> bossCls = Class.forName("com.hyfedu.reflection.Boss");

        //2.创建对象
        Object o = bossCls.newInstance();

        //3.调用 public 的 hi 方法
        //Method hi1 = bossCls.getMethod("hi",String.class);
        Method hi2 = bossCls.getDeclaredMethod("hi", String.class);
        hi2.invoke(o, "何蛋");

        //4.调用 private static 方法
        //(1)得到 say 方法对象
        Method say = bossCls.getDeclaredMethod("say", int.class, String.class, char.class);
        //(2)因为 say 方法时 private，所以需要爆破
        say.setAccessible(true);
        System.out.println(say.invoke(o, 100, "何蛋", '男'));
        //(3)因为 say 方法是 static 的，还可以这样调用
        System.out.println(say.invoke(null, 200, "小龙", '女'));

        //5.在反射中，如果方法有返回值，统一返回Object
        Object reVal = say.invoke(null, 300, "小贾", '男');
        System.out.println("reVal 的运行类型="+ reVal.getClass());
    }
}

class Boss {
    public int age;
    private static String name;

    public Boss() {
    }

    private static String say(int n, String s, char c) {
        return n + " " + s + " " + c;
    }

    public void hi(String s) {
        System.out.println("hi" + s);
    }
}