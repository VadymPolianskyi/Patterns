package com.polyanski.bridge;

/**
 * Author: vadym
 * Date: 13.02.17
 * Time: 23:49
 */
public class RedCircle implements DrawAPI {
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius:"  + radius + ", x: " + x + ", " + y + "]");
    }
}
