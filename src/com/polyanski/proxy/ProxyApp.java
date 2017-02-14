package com.polyanski.proxy;

/**
 * Author: vadym
 * Date: 14.02.17
 * Time: 14:36
 */
public class ProxyApp {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        image.display();
        System.out.println("");

        image.display();
    }
}
