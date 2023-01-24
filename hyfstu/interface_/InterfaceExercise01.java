package hyfstu.interface_;

public class InterfaceExercise01 {
    public static void main(String[] args) {
        C c = new C();
        c.pX();
    }
}
interface AA{
    int x=0;
}
class B{
    int x=1;
}
class C extends B implements AA{
    public void pX(){
        System.out.println(AA.x+" "+super.x);
    }
}