package com.polyanski.factory;

/**
 * Author: vadym
 * Date: 14.02.17
 * Time: 10:35
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle::draw()");
    }
}
