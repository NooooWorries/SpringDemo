package com.ch01.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestBean {

    public static void main(String[] args) {
        // 新建一个xml配置类，导入applicationContext.xml
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 输入配置的id来获取配置的对象
        BeanNonStatic bean = (BeanNonStatic) context.getBean("beanNonStatic");
        // 执行函数，测试效果
        System.out.println(bean);
        bean.add();
    }
}
