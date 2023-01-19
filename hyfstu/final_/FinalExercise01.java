package hyfstu.final_;

public class FinalExercise01 {
    public static void main(String[] args) {
        Circle circle1 = new Circle(5.0);
        System.out.println("面积="+circle1.calArea());
    }
}

class Circle {
    private double radius;
    private final double PI = 3.14;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double calArea() {
        return PI * radius * radius;
    }
}