package com.polyanski.mediator;

/**
 * Author: vadym
 * Date: 14.02.17
 * Time: 11:20
 */
public class MediatorApp {
    public static void main(String[] args) {
        User robert = new User("Robert");
        User john = new User("John");

        robert.sendMessage("Hi! John!");
        john.sendMessage("Hello! Robert!");
    }
}
