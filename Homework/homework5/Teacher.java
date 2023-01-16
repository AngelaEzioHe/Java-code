package hyfstu.Homework.homework5;

public class Teacher extends Employee {
    private int classDay; //上课天数
    private double classSal; //课时费

    public Teacher(String name, double sal) {
        super(name, sal);
    }

    public int getClassDay() {
        return classDay;
    }

    public void setClassDay(int classDay) {
        this.classDay = classDay;
    }

    public double getClassSal() {
        return classSal;
    }

    public void setClassSal(double classSal) {
        this.classSal = classSal;
    }

    public void printSal() {
        System.out.println("教师 " + getName() + " 年工资" + (getSal() * getSalMonth() + classDay * classSal));
    }
}
