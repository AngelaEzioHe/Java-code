import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 * @Author: EzioHe
 * @Date: 2023/5/16 0:01
 */
public class Properties_ {
    public static void main(String[] args) throws IOException {
        //1.创建Properties对象
        Properties properties = new Properties();
        //2.加载指定配置文件
        properties.load(new FileReader("src\\file\\Directory_.java"));
        //3.把k-v显示控制台
        properties.list(System.out);
    }
}
