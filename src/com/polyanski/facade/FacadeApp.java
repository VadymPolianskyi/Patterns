package com.polyanski.facade;

/**
 * Author: vadym
 * Date: 14.02.17
 * Time: 10:36
 */
public class FacadeApp {
    public static void main(String[] args) {
        ShapeMaker shapeMaker = new ShapeMaker();

        shapeMaker.drawCircle();
        shapeMaker.drawRectangle();
        shapeMaker.drawSquare();
    }
}
