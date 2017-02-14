package com.polyanski.observer;

/**
 * Author: vadym
 * Date: 14.02.17
 * Time: 12:30
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
