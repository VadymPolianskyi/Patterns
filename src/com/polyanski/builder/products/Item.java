package com.polyanski.builder.products;

import com.polyanski.builder.pack.Packing;

/**
 * Author: vadym
 * Date: 14.02.17
 * Time: 0:04
 */
public interface Item {
    public String name();
    public Packing packing();
    public float price();
}
