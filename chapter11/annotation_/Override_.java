package annotation_;

/**
 * @author 何蛋
 * @version 1.0
 */
public class Override_ {
    public static void main(String[] args) {

    }
}
class Father{
    public void fly(){
        System.out.println("Father fly...");
    }
}
class Son extends Father{
    @Override
    public void fly() {
        System.out.println("Son fly...");
    }
}