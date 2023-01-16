package hyfstu.Homework.homework4;

public class Manager extends Employee {
    private double bonus;

    public Manager(String name, double daysal, int workDays, double grade) {
        super(name, daysal, workDays, grade);
    }

    @Override
    public void printsal() {
        System.out.println("经理 " + getName() + " 工资是=" +
                (bonus + getDaysal() * getWorkDays() * getGrade()));
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
