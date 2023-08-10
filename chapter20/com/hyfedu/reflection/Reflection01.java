package com.hyfedu.reflection;

import com.hyfedu.Cat;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * @Author: EzioHe
 * @Date: 2023/8/10 17:25
 */
public class Reflection01 {
    public static void main(String[] args) throws Exception {
        //1.使用 Properties 类，可以读写配置文件
        Properties properties = new Properties();
        properties.load(new FileInputStream("src\\re.properties"));
        String classfullpath = properties.get("classfullpath").toString();
        String methodName = properties.get("method").toString();


        //2.使用反射机制解决
        //(1)加载类，返回Class类型的对象
        Class cls = Class.forName(classfullpath);
        //(2)通过 cls 对象 得到你加载的类 com.hyf.edu.Cat 的对象实例
        Cat o = (Cat)cls.newInstance();
        System.out.println("o的运行类型="+o.getClass());
        //(3)通过 cls 得到你加载的类 com.hyfedu.Cat 的 methodName"hi" 的方法对象
        //   即:在反射中，可以把方法视为对象（万物皆对象）
        Method method1 = cls.getMethod(methodName);
        //(4)通过 method1调用方法:即通过方法对象来实现调用方法
        System.out.println("==================================");
        method1.invoke(o); //传统方法 对象.方法() ,反射机制 方法.invoke(对象)

        //java,lang,reflect.Field: 代表类的成员变量，Field对象表示某个类的成员变量
        //得到 name 字段
        //getField 不能得到私有的属性
        Field nameField = cls.getField("age");
        System.out.println(nameField.get(o));

        //java.lang.reflect.Constructor: 代表类的构造方法，Constructor 对象表示构造器
        Constructor constructor1 = cls.getConstructor(); //()中可以指定构造器的参数类型，没有写代表返回的无参构造器
        System.out.println(constructor1);

        Constructor constructor2 = cls.getConstructor(String.class);
        System.out.println(constructor2);
    }
}
