package com.yoshitha.lld.fooddelivery.domain;

import com.yoshitha.lld.fooddelivery.decorator.FoodItem;

public class OrderItem {

    private FoodItem item;
    private int quantity;

    public OrderItem(FoodItem item){
        this.item = item;
    }

    public double getPrice() {
        return item.getPrice()*this.getQuantity();
    }

    public FoodItem getItem() {
        return this.item;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

}
