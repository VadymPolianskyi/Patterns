package com.polyanski.decorator;

/**
 * Author: vadym
 * Date: 14.02.17
 * Time: 10:06
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}
