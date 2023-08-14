package com.hyfedu.reflection.question;

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @Author: EzioHe
 * @Date: 2023/8/14 22:36
 * @如何通过反射获取类的结构信息
 */
public class ReflectionUtils {
    public static void main(String[] args) {

    }
    //第一组方法API
    @Test
    public void api_01() throws ClassNotFoundException {
        //得到Class对象
        Class<?> personCls = Class.forName("com.hyfedu.reflection.question.Person");
        //getName:获取全类名
        System.out.println(personCls.getName());
        //getSimpleName:获取简单类名
        System.out.println(personCls.getSimpleName());
        //getFields:获取所有public修饰的属性，包含本类以及父类的
        Field[] fields = personCls.getFields();
        for (Field field : fields) {
            System.out.println("本类以及父类的属性"+field.getName());
        }
        //getDeclaredFields:获取本类中所有属性
        Field[] declaredFields = personCls.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println("本类所有属性"+declaredField.getName());
        }
        //getMethod:获取所有public修饰的方法，包含本类以及父类的
        Method[] methods = personCls.getMethods();
        for (Method method : methods) {
            System.out.println("本类及其父类的方法="+method.getName());
        }
        //getDeclaredMethods:获取本类中所有方法
        Method[] declaredMethods = personCls.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println("本类中所有方法="+declaredMethod.getName());
        }
        //
        Constructor<?>[] constructors = personCls.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println("本类以及父类的构造器="+constructor.getName());
        }
    }
}
class A{
    public String hobby;
    public void hi(){

    }

    public A(){

    }
}

class Person extends A{
    //属性
    public String name;
    protected int age;
    String job;
    private double sal;

    //构造器
    public Person(){

    }
    public Person(String name){

    }

    //方法
    public void m1(){

    }
    protected void m2(){

    }
    void m3(){

    }
    private void m4(){

    }
}