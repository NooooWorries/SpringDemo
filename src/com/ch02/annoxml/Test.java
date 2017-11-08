package com.ch02.annoxml;

import com.ch02.anno.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("annoxml.xml");
        com.ch02.annoxml.UserService userService = (com.ch02.annoxml.UserService) applicationContext.getBean("userService1");
        userService.add();
    }
}
