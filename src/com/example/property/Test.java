package com.example.property;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        // 新建一个xml配置类，导入applicationContext.xml
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        PropertyDemo1 propertyDemo1 = (PropertyDemo1)context.getBean("propertyDemoOne");
        propertyDemo1.test();
    }
}
