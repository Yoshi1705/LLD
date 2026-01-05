package com.yoshitha.lld.fooddelivery.creational.builder;

import com.yoshitha.lld.fooddelivery.domain.MenuItem;

public class MenuItemBuilder {

    MenuItem item;
    public MenuItemBuilder setId(String id) {
        this.item.setId(id);
        return this;
    }
    public MenuItemBuilder() {
        this.item = new MenuItem();

    }
    public MenuItemBuilder setName(String name) {
        this.item.setName(name);
        return this;
    }
    public MenuItemBuilder setBasePrice(double price) {
        this.item.setBasePrice(price);
        return this;
    }
    public MenuItemBuilder setType(String type) {
        this.item.setType(type);
        return this;
    }
    public MenuItem build() {
        return this.item;
    }
}
