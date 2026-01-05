package com.yoshitha.lld.fooddelivery.strategy;

import com.yoshitha.lld.fooddelivery.domain.Order;
import com.yoshitha.lld.fooddelivery.domain.OrderItem;

import java.util.List;

public interface PriceStrategy {

    public double calculatePrice(List<OrderItem> items);
}
