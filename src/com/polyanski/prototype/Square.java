package com.polyanski.prototype;

/**
 * Author: vadym
 * Date: 14.02.17
 * Time: 14:15
 */
public class Square extends Shape {

    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
