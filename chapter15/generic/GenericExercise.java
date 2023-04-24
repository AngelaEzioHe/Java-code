package generic;

import java.util.*;

/**
 * @Author: EzioHe
 * @Date: 2023/4/23 19:33
 */
@SuppressWarnings({"all"})
public class GenericExercise {
    public static void main(String[] args) {
        //使用泛型方式给 HashSet 放入 3 个学生对象
        HashSet<Student> students = new HashSet<>();
        students.add(new Student("jack", 18));
        students.add(new Student("tom", 28));
        students.add(new Student("mary", 19));

        for (Student student : students) {
            System.out.println(student);
        }

        //使用泛型方式给 HashMap 放入 3 个学生对象
        HashMap<String, Student> hm = new HashMap<String,Student>();
        hm.put("tom",new Student("tom",28));
        hm.put("smith",new Student("smith",38));
        hm.put("milan",new Student("milan",48));

        Set<Map.Entry<String, Student>> entries = hm.entrySet();
        Iterator<Map.Entry<String, Student>> iterator = entries.iterator();
    }
}

class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
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
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}