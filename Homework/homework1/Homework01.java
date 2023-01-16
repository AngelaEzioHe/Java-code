package hyfstu.Homework.homework1;

public class Homework01 {
    public static void main(String[] args) {
        Person[] person = new Person[3];
        person[0] = new Person("jack", 10, "JavaEE工程师");
        person[1] = new Person("tom", 50, "大数据工程师");
        person[2] = new Person("mary", 30, "PHP工程师");
        Person temp = null;
        for (int i = 0; i < person.length; i++) {
            for (int j = 0; j < person.length - 1 - i; j++) {
                if (person[i].getAge() < person[i + 1].getAge()) {
                    temp = person[i];
                    person[i] = person[i + 1];
                    person[i + 1] = temp;
                }
            }
        }
        //按年龄从大到小排序
        for (int i = 0; i < person.length; i++) {
            System.out.println(person[i]);
        }
    }
}

class Person {
    private String name;
    private int age;
    private String job;

    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}