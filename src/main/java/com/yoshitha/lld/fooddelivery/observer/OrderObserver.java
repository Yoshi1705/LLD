package com.yoshitha.lld.fooddelivery.observer;

import com.yoshitha.lld.fooddelivery.domain.Order;

public interface OrderObserver {

    void update(Order order);

}
