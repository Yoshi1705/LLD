package com.yoshitha.lld.fooddelivery.strategy;

import com.yoshitha.lld.fooddelivery.domain.OrderItem;

import java.util.List;

public class PremiumPricing implements PriceStrategy{
    @Override
    public double calculatePrice(List<OrderItem> items) {
         double ans = 0;
       for(OrderItem item : items){
           ans+= item.getPrice();
       }
       return ans-ans*0.1;
    }
}
