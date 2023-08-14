package com.hyfedu.reflection.classload_;

/**
 * @Author: EzioHe
 * @Date: 2023/8/14 21:14
 * @演示类加载-初始化阶段
 */
public class ClassLoad03 {
    public static void main(String[] args) throws ClassNotFoundException {
        //1.加载B类，并生成B的Class对象
        //2.链接 num=0
        //new B();
        System.out.println(B.num); //如果直接使用类的静态属性，也会导致类的加载

        Class<?> b = Class.forName("B");
    }
}
class B{
    static {
        System.out.println("B 静态代码块儿被执行");
        num=300;
    }
    static int num=100;
    public B(){
        System.out.println("B() 构造器被执行");
    }
}