package com.ch02.annoxml;


import javax.annotation.Resource;

public class UserService {
    // 得到UserDAO和OrderDAO的过程
    // 用配置文件来实现

    @Resource(name="userDAO1")
    private UserDAO1 userDAO1;

    @Resource(name="orderDAO")
    private OrderDAO orderDAO;

    public void add() {
        System.out.println("User service");
        userDAO1.add();
        orderDAO.add();

    }
}
