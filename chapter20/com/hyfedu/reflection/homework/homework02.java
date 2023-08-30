package com.hyfedu.reflection.homework;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Author: EzioHe
 * @Date: 2023/8/31 0:07
 */
public class homework02 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> fileCls = Class.forName("java.io.File");
        Constructor<?>[] declaredConstructors = fileCls.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println("File构造器="+declaredConstructor);
        }
        Constructor<?> declaredConstructor = fileCls.getDeclaredConstructor(String.class);
        String fileAllPath="d:mynew.txt";
        Object file = declaredConstructor.newInstance(fileAllPath);
        Method createNewFile = fileCls.getMethod("createNewFile");
        createNewFile.invoke(file);
        System.out.println(file.getClass());
        System.out.println("创建文件成功"+fileAllPath);
    }
}
