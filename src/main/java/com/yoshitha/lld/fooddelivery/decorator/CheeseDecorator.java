package com.yoshitha.lld.fooddelivery.decorator;

public class CheeseDecorator extends FoodItemDecorator{


    public CheeseDecorator(FoodItem item){
      super(item);
    }

    @Override
    public double getPrice() {
        return item.getPrice() + 45;
    }

    @Override
    public String getDescription() {
        return item.getDescription() + " added cheese 🧀";
    }
}
