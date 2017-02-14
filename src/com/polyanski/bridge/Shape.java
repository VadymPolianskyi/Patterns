package com.polyanski.bridge;

/**
 * Author: vadym
 * Date: 13.02.17
 * Time: 23:51
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI) {
        this.drawAPI = drawAPI;
    }

    public abstract void draw();
}
