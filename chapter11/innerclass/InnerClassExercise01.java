package innerclass;

/**
 * @Author: EzioHe
 * @Date: 2023/4/10 0:26
 */
public class InnerClassExercise01 {
    public static void main(String[] args) {
        f1(new IL() {
            @Override
            public void show() {
                System.out.println("这是一幅名画");
            }
        });
    }

    //静态方法，形参是接口类型
    public static void f1(IL il){
        il.show();
    }
}

interface IL{
    void show();
}