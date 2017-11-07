package com.example.property;

public class PropertyDemo1 {
    private String username;

    public PropertyDemo1(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void test() {
        System.out.println("Property demonstrate one " + username);
    }
}
