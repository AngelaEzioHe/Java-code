package hyfstu.Homework.homework4;

public class Homework04 {
    public static void main(String[] args) {
        Manager manager = new Manager("马云", 100, 20, 1.2);
        manager.setBonus(3000);
        manager.printsal();
        Worker worker = new Worker("打工仔", 50, 10, 1.0);
        worker.printsal();
    }
}
