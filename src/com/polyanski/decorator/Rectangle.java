package com.polyanski.decorator;

/**
 * Author: vadym
 * Date: 14.02.17
 * Time: 10:06
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}
