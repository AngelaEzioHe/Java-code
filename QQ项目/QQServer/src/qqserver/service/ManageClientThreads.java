package qqserver.service;

import java.util.HashMap;
import java.util.Iterator;

/**
 * @Author: EzioHe
 * @Date: 2023/5/31 23:46
 * @该类用于管理和客户端通信的线程
 */
public class ManageClientThreads {
    private static HashMap<String, ServerConnectClientThread> hm = new HashMap<>();

    //添加线程对象到 hm 集合
    public static void addClientThread(String userId, ServerConnectClientThread serverConnectClientThread) {
        hm.put(userId, serverConnectClientThread);
    }

    //根据 userId 返回 ServerConnectClientThread 线程
    public static ServerConnectClientThread getserverConnectClientThread(String userId) {
        return hm.get(userId);
    }

    //从集合中移除某个线程对象
    public static void removeServerConnectClientThread(String userId){
        hm.remove(userId);
    }
    //这里编写方法，可以返回在线用户列表
    public static String getOnlineUser() {
        //集合遍历，遍历 hashMap 的 key
        Iterator<String> iterator = hm.keySet().iterator();
        String onlineUserList = "";
        while (iterator.hasNext()) {
            onlineUserList += iterator.next().toString() + " ";
        }
        return onlineUserList;
    }
}