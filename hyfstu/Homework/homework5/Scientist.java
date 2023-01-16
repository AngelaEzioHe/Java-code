package hyfstu.Homework.homework5;

public class Scientist extends Employee{
    private double bonus;

    public Scientist(String name, double sal) {
        super(name, sal);
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    @Override
    public void printSal() {
        System.out.print("科学家 ");
        System.out.println(getName()+" 年工资是："+(getSal()*getSalMonth()+bonus));
    }
}
