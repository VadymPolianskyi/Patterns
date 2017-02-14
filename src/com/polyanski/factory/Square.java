package com.polyanski.factory;

/**
 * Author: vadym
 * Date: 14.02.17
 * Time: 10:34
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square::draw()");
    }
}
