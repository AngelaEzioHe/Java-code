package qqclient.service;

import java.util.HashMap;

/**
 * @Author: EzioHe
 * @Date: 2023/5/31 22:13
 */
public class ManageClientConnectServerThread {
    //把多个线程放入到一个 HashMap 集合， 可以 就是用户id,value 就是线程
    private static HashMap<String, ClientConnectServeThread> hm = new HashMap<>();

    //将摸个线程加入到集合
    public static void addClientConnectServerThread(String userId, ClientConnectServeThread clientConnectServeThread) {
        hm.put(userId, clientConnectServeThread);
    }

    //通过userId可以得到对应的线程
    public static ClientConnectServeThread getClientConnectServeThread(String userId) {
        return hm.get(userId);
    }
}