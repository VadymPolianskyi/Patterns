package com.polyanski.factory;

/**
 * Author: vadym
 * Date: 14.02.17
 * Time: 10:15
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle::draw()");
    }
}
