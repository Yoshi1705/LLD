package com.yoshitha.lld.fooddelivery.decorator;

public abstract class FoodItemDecorator implements FoodItem{

    protected final FoodItem item;

    protected FoodItemDecorator(FoodItem item) {
        this.item = item;
    }

}
