package qqcommon;

import java.io.Serializable;

/**
 * @Author: EzioHe
 * @Date: 2023/5/27 14:25
 * @表示一个用户信息
 */
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    private String userId; //用户ID/用户名
    private String passwd;

    public User(String userId, String passwd) {
        this.userId = userId;
        this.passwd = passwd;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }
}