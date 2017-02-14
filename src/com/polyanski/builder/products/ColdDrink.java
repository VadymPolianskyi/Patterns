package com.polyanski.builder.products;

import com.polyanski.builder.pack.Bottle;
import com.polyanski.builder.pack.Packing;

/**
 * Author: vadym
 * Date: 14.02.17
 * Time: 0:11
 */
public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
