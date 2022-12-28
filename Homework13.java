public class Homework13 {
    public static void main(String[] args) {
        Circle c=new Circle();
        PassObject po=new PassObject();
        po.printAreas(c,5);
    }
}
class Circle{
    double radius;
    public Circle(){

    }
    public Circle(double radius){
        this.radius=radius;
    }
    public double findArea(){
        return Math.PI*radius*radius;
    }
    public void setRadius(double radius){
        this.radius=radius;
    }
}
class PassObject{
    public void printAreas(Circle c,int times){
        System.out.println("Radius\tArea");
        for(double i=1;i<=times;i++){
            c.setRadius(i);
            System.out.println(i+"\t"+c.findArea());
        }
    }
}