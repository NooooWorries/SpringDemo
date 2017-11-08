package com.ch02.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("annotation.xml");
        UserService userService = (UserService) applicationContext.getBean("userService");
        userService.add();
    }
}
