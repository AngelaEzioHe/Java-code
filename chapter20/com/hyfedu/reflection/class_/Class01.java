package com.hyfedu.reflection.class_;

import com.hyfedu.Cat;

/**
 * @Author: EzioHe
 * @Date: 2023/8/10 19:12
 * @对Class类特点的梳理
 */
public class Class01 {
    public static void main(String[] args) throws ClassNotFoundException {
        Cat cat = new Cat();
        Class cls1 = Class.forName("com.hyfedu.Cat");
        Class cls2 = Class.forName("com.hyfedu.Cat");
        System.out.println(cls1.hashCode());
        System.out.println(cls2.hashCode());
        Class cls3 = Class.forName("com.hyfedu.Dog");
    }
}