package com.polyanski.command;

/**
 * Author: vadym
 * Date: 14.02.17
 * Time: 9:21
 */
public class Stock {
    private String name = "ABC";
    private int quantity = 10;

    public void buy() {
        System.out.println("Stock [ Name: " + name + "," +
                " Quantity: " + quantity + " ] bought");
    }

    public void sell(){
        System.out.println("Stock [ Name: "+name+", " +
                "Quantity: " + quantity + " ] sold");
    }
}
