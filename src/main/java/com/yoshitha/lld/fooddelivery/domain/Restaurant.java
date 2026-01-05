package com.yoshitha.lld.fooddelivery.domain;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {

    private String restaurantId;
    private String name;
    private List<MenuItem> menu;

    public String getRestaurantId() {
        return restaurantId;
    }

    public void setRestaurantId(String restaurantId) {
        this.restaurantId = restaurantId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<MenuItem> getMenu() {
        return new ArrayList<>(menu);
    }

    public void setMenu(List<MenuItem> menu) {
        this.menu = new ArrayList<>(menu);
    }
}
