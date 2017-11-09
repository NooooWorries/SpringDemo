package com.ch02.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main (String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("aop.xml");
        Book book = (Book)context.getBean("aopBook");
        book.add();
    }
}
