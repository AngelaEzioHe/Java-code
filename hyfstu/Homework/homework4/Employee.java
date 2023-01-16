package hyfstu.Homework.homework4;

public class Employee {
    private String name;
    private double daysal;
    private int workDays;
    private double grade;

    public Employee(String name, double daysal, int workDays, double grade) {
        this.name = name;
        this.daysal = daysal;
        this.workDays = workDays;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getDaysal() {
        return daysal;
    }

    public void setDaysal(double daysal) {
        this.daysal = daysal;
    }

    public int getWorkDays() {
        return workDays;
    }

    public void setWorkDays(int workDays) {
        this.workDays = workDays;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public void printsal() {
        System.out.println(name + " 工资=" + daysal * workDays * grade);
    }
}
