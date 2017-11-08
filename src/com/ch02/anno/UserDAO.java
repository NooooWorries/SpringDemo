package com.ch02.anno;

import org.springframework.stereotype.Component;

@Component(value="userDAO")
public class UserDAO {
    public void add() {
        System.out.print("User data access object");
    }
}
