package com.ch01.bean;

public class BeanFactory {
    // 建立静态方法，让其返回类对象
    public static Bean getBean() {
        return new Bean();
    }
}
