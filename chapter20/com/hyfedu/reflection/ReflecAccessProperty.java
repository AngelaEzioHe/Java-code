package com.hyfedu.reflection;

import java.lang.reflect.Field;

/**
 * @Author: EzioHe
 * @Date: 2023/8/15 11:18
 */
public class ReflecAccessProperty {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException {
        //1.得到Student类对应的Class对象
        Class<?> stuClass = Class.forName("com.hyfedu.reflection.Student");

        //2.创建对象
        Object o = stuClass.newInstance(); //o 的运行类型就是Student
        System.out.println(o.getClass());

        //3.使用反射得到 age 属性对象
        Field age = stuClass.getField("age");
        age.set(o,88); //通过反射操作属性
        System.out.println(o);
        System.out.println(age.get(o)); //返回age属性的值

        //4，使用反射操作 name 属性
        Field name = stuClass.getDeclaredField("name");
        //（1）对 name 进行爆破，之后可以操作 priva 属性的对象
        name.setAccessible(true);
        //name.set(o,"何蛋");
        name.set(null,"何蛋"); //因为 name 是 static 属性，因此 o 也可以写成 null
        System.out.println(o);
        System.out.println(name.get(o)); //获取属性值
        System.out.println(name.get(null)); //获取属性值,要求 name 是 static
    }
}
class Student{
    public int age;
    private static String name;

    public Student(){

    }

    @Override
    public String toString() {
        return "Student [" +
                "age=" + age +
                ", name="+name+
                ']';
    }
}