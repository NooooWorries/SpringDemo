package com.example.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class TextIoC {
    public static void main (String[] args) {
        // 新建一个xml配置类，导入applicationContext.xml
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 得到配置创建的对象，输入配置的id
        User user = (User) context.getBean("user");
        // 执行函数，测试效果
        System.out.println(user);
        user.add();
    }
}
