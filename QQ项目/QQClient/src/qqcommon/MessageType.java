package qqcommon;

/**
 * @不同常量的值表示不同的消息类型
 */
public interface MessageType {
    String MESSAGE_LOGIN_SUCCEED = "1"; //表示登陆成功
    String MESSAGE_LOGIN_FAIL = "2"; //表示登陆失败
    String MESSAGE_COMM_MES = "3"; //普通信息对象
    String MESSAGE_GET_ONLINE_FRIEND = "4"; //要求返回在线用户列表
    String MESSAGE_RETURN_ONLINE_FRIEND = "5"; //返回在线用户列表
    String MESSAGE_CLIENT_EXIT = "6"; //客户端请求退出
}