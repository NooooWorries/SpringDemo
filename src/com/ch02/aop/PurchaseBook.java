package com.ch02.aop;

import org.aspectj.lang.ProceedingJoinPoint;

public class PurchaseBook {
    // 前置增强
    public void before() {
        System.out.println("前置增强");
    }

    // Proceed Joint Point 调用被增强的方法
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {

        // 前置
        System.out.println("环绕前置增强");

        // proceed joint point 执行被增强的方法
        proceedingJoinPoint.proceed();

        // 后置
        System.out.println("环绕后置增强");
    }
}
