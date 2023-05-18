package api;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @Author: EzioHe
 * @Date: 2023/5/18 1:28
 * @注释: 演示 INetAddress的使用
 */
public class API_ {
    public static void main(String[] args) throws UnknownHostException {
        //获取本机的InetAddress对象
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);

        //根据指定的主机名获取对象
        InetAddress host1 = InetAddress.getByName("何宇飞的主机");
        System.out.println("host1="+host1);

        //根据一个域名返回InetAddress对象
        InetAddress host2 = InetAddress.getByName("www.baidu.com");
        System.out.println("host2="+host2);

        //通过InetAddress对象，获取对应的地址
        String hostAddress = host2.getHostAddress();
        System.out.println("host2对应的ip="+hostAddress);

        //通过InetAddress对象，获取对应的域名
        String hostName = host2.getHostName();
        System.out.println("host2对应的域名="+hostName);
    }
}
