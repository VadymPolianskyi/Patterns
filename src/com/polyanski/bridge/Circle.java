package com.polyanski.bridge;

/**
 * Author: vadym
 * Date: 13.02.17
 * Time: 23:52
 */
public class Circle extends Shape {
    private int x, y, radius;

    protected Circle(int x, int y, int radius, DrawAPI drawAPI) {
        super(drawAPI);
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    @Override
    public void draw() {
        drawAPI.drawCircle(radius, x, y);
    }
}
