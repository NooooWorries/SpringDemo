package com.ch02.anno;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service(value="userService")
public class UserService {

    @Autowired
    private UserDAO userDAO;
    // 使用注解方法不需要set函数

    public void add() {
        System.out.println("User service");
        userDAO.add();
    }
}
