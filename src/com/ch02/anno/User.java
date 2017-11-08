package com.ch02.anno;

import org.springframework.stereotype.Component;

@Component(value = "user")
public class User {
    public void add() {
        System.out.println("Annotation example");
    }
}
