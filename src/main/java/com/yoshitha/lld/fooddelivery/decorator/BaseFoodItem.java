package com.yoshitha.lld.fooddelivery.decorator;

import com.yoshitha.lld.fooddelivery.domain.MenuItem;

public class BaseFoodItem implements FoodItem{

    MenuItem item;

    public  BaseFoodItem(MenuItem item){
        this.item = item;
    }

    @Override
    public double getPrice() {
        return this.item.getBasePrice();
    }

    @Override
    public String getDescription() {
        return this.item.getName();
    }
}
