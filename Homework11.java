public class Homework11 {
    public static void main(String[] args) {

    }
}
class Employee{
    String name;
    char gender;
    int age;
    String job;
    double sal;
    public Employee(String job,double sal){
        this.job=job;
        this.sal=sal;
    }
    public Employee(String name,char gender,int age){
        this.name=name;
        this.gender=gender;
        this.age=age;
    }
    public Employee(String job,double sal,String name,char gender,int age){
        this(name,gender,age);
        this.job=job;
        this.sal=sal;
    }
}