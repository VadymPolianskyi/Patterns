package com.polyanski.builder.products;

import com.polyanski.builder.pack.Packing;
import com.polyanski.builder.pack.Wrapper;

/**
 * Author: vadym
 * Date: 14.02.17
 * Time: 0:10
 */
public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
