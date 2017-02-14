package com.polyanski.builder.products;

/**
 * Author: vadym
 * Date: 14.02.17
 * Time: 0:12
 */
public class ChickenBurger extends Burger {
    @Override
    public String name() {
        return "Coke";
    }

    @Override
    public float price() {
        return 30.0f;
    }
}
