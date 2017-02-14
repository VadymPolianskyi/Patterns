package com.polyanski.bridge;

/**
 * Author: vadym
 * Date: 13.02.17
 * Time: 23:53
 */
public class BridgeApp {
    public static void main(String[] args) {
            Shape redCircle = new Circle(100,100, 10, new RedCircle());
            Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

            redCircle.draw();
            greenCircle.draw();
    }
}
