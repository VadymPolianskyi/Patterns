package com.polyanski.observer;

/**
 * Author: vadym
 * Date: 14.02.17
 * Time: 12:32
 */
public class ObserverApp {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("First state change: 15");
        subject.setState(15);
        System.out.println("Second state change: 10");
        subject.setState(10);
    }
}
