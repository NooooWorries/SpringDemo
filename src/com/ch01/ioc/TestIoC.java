package com.ch01.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TestIoC {
    public static void main (String[] args) {
        // 新建一个xml配置类，导入applicationContext.xml
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 得到配置创建的对象，输入配置的id
        UserService userService = (UserService) context.getBean("userService");
        // 执行函数，测试效果
        userService.add();
    }
}
