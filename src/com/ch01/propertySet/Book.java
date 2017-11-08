package com.ch01.propertySet;

public class Book {
    private String title;
    private String price;

    public Book() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void test() {
        System.out.print(this.title + "," + this.price);
    }
}
