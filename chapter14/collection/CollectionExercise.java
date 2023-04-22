package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @Author: EzioHe
 * @Date: 2023/4/19 16:17
 */
public class CollectionExercise {
    @SuppressWarnings({"all"})
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(new Dog("小龙",19));
        list.add(new Dog("小樊",18));
        list.add(new Dog("小高",17));

        //先使用for增强
        System.out.println("使用for增强");
        for (Object dog :list) {
            System.out.println("dog="+dog);
        }

        //使用迭代器
        System.out.println("使用迭代器");
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            Object dog = iterator.next();
            System.out.println("dog="+dog);
        }

    }
}

class Dog{
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}