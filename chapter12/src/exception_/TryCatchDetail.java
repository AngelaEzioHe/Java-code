package exception_;

/**
 * @Author: EzioHe
 * @Date: 2023/4/13 0:20
 */
public class TryCatchDetail {
    public static void main(String[] args) {
        try {
            Person person = new Person();
            //person = null;
            System.out.println(person.getName());
            int n1 = 10;
            int n2 = 0;
            int res = n1 / n2;
        } catch (NullPointerException e) {
            System.out.println("空指针异常"+e.getMessage());
        } catch (ArithmeticException e){
            System.out.println("算数异常"+e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
        }
    }
}

class Person {
    private String name = "jack";

    public String getName() {
        return name;
    }
}