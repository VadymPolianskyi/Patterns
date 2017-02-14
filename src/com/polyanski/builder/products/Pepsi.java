package com.polyanski.builder.products;

/**
 * Author: vadym
 * Date: 14.02.17
 * Time: 0:13
 */
public class Pepsi extends ColdDrink {
    @Override
    public String name() {
        return "Pepsi";
    }

    @Override
    public float price() {
        return 35.0f;
    }
}
