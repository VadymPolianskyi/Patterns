package com.polyanski.command;

/**
 * Author: vadym
 * Date: 14.02.17
 * Time: 9:28
 */
public class SellStock implements Order {
    private Stock abcStock;

    public SellStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.sell();
    }
}
