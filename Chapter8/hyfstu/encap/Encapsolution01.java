package hyfstu.encap;

public class Encapsolution01 {
    public static void main(String[] args) {
        Person person = new Person();
        //person.name="jack";
        person.setName("Jackhui");
        person.setAge(300);
        person.setSalary(30000);
        System.out.println("======jack信息======");
        System.out.println(person.info());
        Person smith = new Person("smith", 2000, 50000);
        System.out.println("======smith信息======");
        System.out.println(smith.info());
    }
}

class Person {
    public String name;
    private int age;
    private double salary;

    public Person() {
    }

    public Person(String name, int age, double salary) {
//        this.name = name;
//        this.age = age;
//        this.salary = salary;
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() >= 2 && name.length() <= 6) {
            this.name = name;
        } else {
            System.out.println("名字长度应在2-6，给你一个默认名字-无名氏");
            this.name = "无名氏";
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 1 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("年龄需要在1-120,给你默认年龄18");
            this.age = 18;
        }
    }

    public double getSalary() {
        //可以增加对当前对象的权限判断
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String info() {
        return "信息为 name=" + name + " age=" + age + " salary=" + salary;
    }
}