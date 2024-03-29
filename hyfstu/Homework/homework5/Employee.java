package hyfstu.Homework.homework5;

public class Employee {
    private String name;
    private double sal;
    private int salMonth = 12; //分析带薪的月份 eg:13薪、15薪

    public Employee(String name, double sal) {
        this.name = name;
        this.sal = sal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public int getSalMonth() {
        return salMonth;
    }

    public void setSalMonth(int salMonth) {
        this.salMonth = salMonth;
    }

    public void printSal() {
        System.out.println(name + "的年工资是： " + (sal * salMonth));
    }
}
