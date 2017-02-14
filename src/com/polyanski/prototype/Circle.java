package com.polyanski.prototype;

/**
 * Author: vadym
 * Date: 14.02.17
 * Time: 14:16
 */
public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
