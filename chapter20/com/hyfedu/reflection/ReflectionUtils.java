package com.hyfedu.reflection;

import org.junit.Test;

import java.lang.annotation.Annotation;
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

    @Test
    public void api_02() throws ClassNotFoundException{
        Class<?> personCls = Class.forName("com.hyfedu.reflection.Person");
        //默认修饰符值是0，public是1，private是2，protected是4，static是8，final是16
        Field[] declaredFields = personCls.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println("本类以及父类的属性"+declaredField.getName()
            +" 该属性的修饰符值="+declaredField.getModifiers());
        }
    }


    //第一组方法API
    @Test
    public void api_01() throws ClassNotFoundException {
        //得到Class对象
        Class<?> personCls = Class.forName("com.hyfedu.reflection.Person");

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

        //getConstructors:获取所有public修饰的构造器，包含本类的构造器
        Constructor<?>[] constructors = personCls.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println("本类的构造器="+constructor.getName());
        }

        //getDeclaredConstructors:获取本类中所有的构造器
        Constructor<?>[] declaredConstructors = personCls.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println("本类中所有的构造器="+declaredConstructor.getName());
        }

        //getPackage:以Package形式返包信息
        System.out.println("包信息="+personCls.getPackage());

        //getSuperClass:以Class形式返回父类信息
        Class<?> superclass = personCls.getSuperclass();
        System.out.println("父类的Class的全路径"+superclass.getName());

        //getInterfaces:以Class[]形式返回接口信息
        Class<?>[] interfaces = personCls.getInterfaces();
        for (Class<?> anInterface : interfaces) {
            System.out.println("接口信息="+anInterface);
        }

        //getAnnotations:以Annotation[]形式返回注解信息
        Annotation[] annotations = personCls.getAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println("注解信息="+annotation);
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

interface IA{}
interface IB{}

@Deprecated
class Person extends A implements IA,IB{
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