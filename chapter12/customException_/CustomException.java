package customException_;

/**
 * @Author: EzioHe
 * @Date: 2023/4/13 12:48
 */
public class CustomException {
    public static void main(String[] args) {
        int age=30;
        if(!(age>=18&&age<=120)){
            throw new AgeException("年龄需要在 18~120 之间");
        }
        System.out.println("你的年龄范围正确");
    }
}

//自定义异常
class AgeException extends RuntimeException{
    public AgeException(String message) {
        super(message);
    }
}