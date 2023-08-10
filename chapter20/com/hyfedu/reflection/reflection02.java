package com.hyfedu.reflection;

import com.hyfedu.Cat;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author: EzioHe
 * @Date: 2023/8/10 17:51
 * @测试反射调用的性能，和优化方案
 */
public class reflection02 {
    public static void main(String[] args) throws ClassNotFoundException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException {
        m1();
        m2();
        m3();
    }

    //传统方法来调用hi
    public static void m1() {
        Cat cat = new Cat();
        long start = System.currentTimeMillis();
        for (int i = 0; i < 900000000; i++) {
            cat.hi();
        }
        long end = System.currentTimeMillis();
        System.out.println("传统方法来调用 hi 耗时=" + (end - start));
    }

    //反射机制调用方法
    public static void m2() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class cls = Class.forName("com.hyfedu.Cat");
        Object o = cls.newInstance();
        Method hi = cls.getMethod("hi");
        long start = System.currentTimeMillis();
        for (int i = 0; i < 900000000; i++) {
            hi.invoke(o);
        }
        long end = System.currentTimeMillis();
        System.out.println("m2()方法来调用 hi 耗时=" + (end - start));
    }

    //反射调用优化 + 关闭访问检查
    public static void m3() throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Class cls = Class.forName("com.hyfedu.Cat");
        Object o = cls.newInstance();
        Method hi = cls.getMethod("hi");
        hi.setAccessible(true); //取消在放射调用时，取消访问检测
        long start = System.currentTimeMillis();
        for (int i = 0; i < 900000000; i++) {
            hi.invoke(o);
        }
        long end = System.currentTimeMillis();
        System.out.println("m3()方法来调用 hi 耗时=" + (end - start));
    }
}
