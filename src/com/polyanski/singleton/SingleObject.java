package com.polyanski.singleton;

/**
 * Author: vadym
 * Date: 14.02.17
 * Time: 14:39
 */
public class SingleObject {
    private static SingleObject ourInstance = new SingleObject();

    public static SingleObject getInstance() {
        return ourInstance;
    }

    private SingleObject() {}

    public void showMessage(){
        System.out.println("Hello World!");
    }
}
