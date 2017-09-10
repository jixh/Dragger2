package com.jktaihe.dragger2.qualifiers;


/**
 * Created by jktaihe on 9/9/17.
 * blog: blog.jktaihe.com
 */

public class AppleBean {
    private String name;
    private double price;
    private String color;
    public AppleBean() {
    }
    public AppleBean(String color) {
        this.color = color;
    }
    public AppleBean(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "AppleBean{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}