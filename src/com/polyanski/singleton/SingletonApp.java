package com.polyanski.singleton;

/**
 * Author: vadym
 * Date: 14.02.17
 * Time: 14:40
 */
public class SingletonApp {
    public static void main(String[] args) {

        SingleObject object = SingleObject.getInstance();

        object.showMessage();
    }
}
