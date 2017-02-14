package com.polyanski.prototype;

/**
 * Author: vadym
 * Date: 14.02.17
 * Time: 14:14
 */
public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
