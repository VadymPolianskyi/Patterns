package com.polyanski.command;

/**
 * Author: vadym
 * Date: 14.02.17
 * Time: 9:27
 */
public class BuyStock implements Order {
    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    @Override
    public void execute() {
        abcStock.buy();
    }
}
