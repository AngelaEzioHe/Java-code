package hyfstu.interface_;

public interface A_Interface {
    public int n1=10;
    public void hi();
    default public void ok(){
        System.out.println("ok...");
    }
}
