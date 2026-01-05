package com.yoshitha.lld.fooddelivery.creational.factory;

import com.yoshitha.lld.fooddelivery.creational.builder.RestaurantBuilder;
import com.yoshitha.lld.fooddelivery.domain.*;

import java.util.List;

public class RestaurantFactory {

    public static Restaurant createRestaurant(RestaurantType type){

        List<MenuItem> menu = MenuFactory.createMenu(type);
        switch (type){
            case KFC:
                return  new RestaurantBuilder().setId("KFC").setName("KFC").setMenu(menu).build();
            case MCD:
                return  new RestaurantBuilder().setId("MCD").setName("MCD").setMenu(menu).build();
            default:
            throw new IllegalArgumentException("Restaurant type is not supported"+type);
        }

    }


}
