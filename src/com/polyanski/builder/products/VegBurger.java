package com.polyanski.builder.products;

/**
 * Author: vadym
 * Date: 14.02.17
 * Time: 0:12
 */
public class VegBurger extends Burger {
    @Override
    public String name() {
        return "Veg Burger";
    }

    @Override
    public float price() {
        return 25.0f;
    }
}
