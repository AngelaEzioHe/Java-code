package com.hyfedu.reflection.class_;

import com.hyfedu.Car;

/**
 * @Author: EzioHe
 * @Date: 2023/8/13 16:13
 * @演示得到Class对象的各种方式(6)
 */
public class GetClass_ {
    public static void main(String[] args) throws ClassNotFoundException {
        //1.Class.forName
        String classAllPath="com.hyfedu.Car";
        Class cls1 = Class.forName(classAllPath);
        System.out.println(cls1);

        //2.类名.Class，应用场景：用于参数传递
        Class cls2 = Car.class;
        System.out.println(cls2);

        //3.对象.getClass(),应用场景，有对象实例
        Car car = new Car();
        Class cls3 = car.getClass();
        System.out.println(cls3);

        //4.通过类加载器【4种】来获取到类的Class对象
        //(1)先得到类加载器 car
        ClassLoader classLoader = car.getClass().getClassLoader();
        //(2)通过类加载器得到Class对象
        Class cls4 = classLoader.loadClass(classAllPath);
        System.out.println(cls4);

        System.out.println(cls1.hashCode());
        System.out.println(cls2.hashCode());
        System.out.println(cls3.hashCode());
        System.out.println(cls4.hashCode());

        //5.基本类型(int,char,boolean,float,double,byte,long,short)
        Class<Integer> integerClass = int.class;
        Class<Character> characterClass = char.class;
        Class<Boolean> booleanClass = boolean.class;
        System.out.println(integerClass);
//        System.out.println(characterClass);
//        System.out.println(booleanClass);

        //6.基本数据类型对应的包装，可以通过 .TYPE 得到Class类对象
        Class<Integer> type1 = Integer.TYPE;
        Class<Character> type2 = Character.TYPE;
        System.out.println(type1);

        System.out.println(integerClass.hashCode());
        System.out.println(type1.hashCode());
    }
}
