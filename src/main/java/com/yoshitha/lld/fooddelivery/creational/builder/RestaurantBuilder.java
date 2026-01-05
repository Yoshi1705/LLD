package com.yoshitha.lld.fooddelivery.creational.builder;

import com.yoshitha.lld.fooddelivery.domain.MenuItem;
import com.yoshitha.lld.fooddelivery.domain.Restaurant;

import java.util.List;

public class RestaurantBuilder {

    Restaurant restaurant;

    public RestaurantBuilder(){
        this.restaurant = new Restaurant();
    }

    public RestaurantBuilder setName(String name){
        this.restaurant.setName(name);
        return this;
    }

    public RestaurantBuilder setId(String id){
        this.restaurant.setRestaurantId(id);
        return this;
    }

    public RestaurantBuilder setMenu(List<MenuItem> items){
        this.restaurant.setMenu(items);
        return this;
    }

    public Restaurant build(){
        return this.restaurant;
    }
}
