package com.meng.myredis.bean;

/**
 * @Author ZuoHao
 * @Date 2020/11/13
 * @Description
 */
public class User {
    private long userId;
    private String name;
    public User(long userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public User() {
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                '}';
    }
}
