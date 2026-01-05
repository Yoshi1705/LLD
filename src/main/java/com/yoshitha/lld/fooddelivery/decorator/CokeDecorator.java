package com.yoshitha.lld.fooddelivery.decorator;

public class CokeDecorator extends FoodItemDecorator {

    public CokeDecorator(FoodItem item){
         super(item);
    }

    @Override
    public double getPrice() {
        return item.getPrice()+75;
    }

    @Override
    public String getDescription() {
        return item.getDescription()+" added coke 😊";
    }
}
