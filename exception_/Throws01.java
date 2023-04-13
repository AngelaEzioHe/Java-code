package exception_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * @Author: EzioHe
 * @Date: 2023/4/13 0:49
 */
public class Throws01 {
    public static void main(String[] args) {

    }

    public void f1() throws FileNotFoundException {
        FileInputStream f1 = new FileInputStream("d://aa.txt");
    }
}
