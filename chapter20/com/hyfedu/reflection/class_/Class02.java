package com.hyfedu.reflection.class_;

import java.lang.reflect.Field;

/**
 * @Author: EzioHe
 * @Date: 2023/8/12 22:41
 */
public class Class02 {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        String classAllPath="com.hyfedu.Car";
        Class<?> cls = Class.forName(classAllPath);
        //出书cls
        System.out.println(cls);
        System.out.println(cls.getClass());
        //得到包名
        System.out.println(cls.getPackage().getName());
        //得到类名
        System.out.println(cls.getName());
        //通过cls创建对象实例
        Object car = cls.newInstance();
        System.out.println(car);
        //通过反射获取属性 brand
        Field brand = cls.getField("brand");
        System.out.println(brand.get(car));
        brand.set(car,"奔驰");
        System.out.println(brand.get(car));
        System.out.println("=========所有的字属性=========");
        Field[] fields = cls.getFields();
        for(Field f:fields){
            System.out.println(f.getName());
        }
    }
}