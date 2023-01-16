package hyfstu.Homework.homework5;

public class Homework05 {
    public static void main(String[] args) {
        Worker jack = new Worker("jack", 10000);
        jack.setSalMonth(15);
        jack.printSal();

        Peasant smith = new Peasant("Smith", 20000);
        smith.setSalMonth(8);
        smith.printSal();

        Teacher teacher = new Teacher("老韩", 2000);
        teacher.setClassDay(360);
        teacher.setClassSal(1000);
        teacher.printSal();

        Scientist scientist = new Scientist("钟南山", 20000);
        scientist.setBonus(2000000);
        scientist.printSal();
    }
}
