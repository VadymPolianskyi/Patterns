package com.polyanski.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Author: vadym
 * Date: 14.02.17
 * Time: 9:28
 */
public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){

        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
