package com.polyanski.builder;

import com.polyanski.builder.products.ChickenBurger;
import com.polyanski.builder.products.Pepsi;
import com.polyanski.builder.products.VegBurger;

/**
 * Author: vadym
 * Date: 14.02.17
 * Time: 0:15
 */
public class MealBuilder {

    public Meal prepareVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Pepsi());
        return meal;
    }

    public Meal prepareNonVegMeal() {
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
