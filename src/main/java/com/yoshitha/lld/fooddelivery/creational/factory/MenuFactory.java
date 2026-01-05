package com.yoshitha.lld.fooddelivery.creational.factory;

import com.yoshitha.lld.fooddelivery.creational.builder.MenuItemBuilder;
import com.yoshitha.lld.fooddelivery.domain.MenuItem;
import com.yoshitha.lld.fooddelivery.domain.RestaurantType;

import java.util.ArrayList;
import java.util.List;

public class MenuFactory {

    public static List<MenuItem> createMenu(RestaurantType type) {
        switch (type) {
            case KFC:
                return buildKFCMenu();

            case MCD:
                return buildMCDMenu();

            default:
                throw new IllegalArgumentException("Unsupported restaurant type: " + type);
        }
    }

    public static MenuItem createMcAlooTikki(){
        return new MenuItemBuilder().setId("MCD_ALOO_TIKKI").setName("ALOOTIKKI").setBasePrice(300).setType("VEG").build();
    }
    public static MenuItem createChickenKebabBurger(){
        return new MenuItemBuilder().setId("MCD_CHICKEN_KEBAB_BURGER").setName("CHICKENKEBABBURGER").setBasePrice(400).setType("NONVEG").build();
    }
    public static MenuItem createMcNuggets(){
        return new MenuItemBuilder().setId("MCD_MC_NUGGETS").setName("MCDMCNUGGETS").setBasePrice(600).setType("NONVEG").build();
    }

    public static List<MenuItem> buildMCDMenu(){
        List<MenuItem> items = new ArrayList<>();
        items.add(MenuFactory.createMcAlooTikki());
        items.add(MenuFactory.createChickenKebabBurger());
        items.add(MenuFactory.createMcNuggets());
        return items;
    }

    public static MenuItem createVegBurger(){
        return new MenuItemBuilder().setId("KFC_BURGER_VEG").setName("BURGER").setBasePrice(300).setType("VEG").build();
    }
    public static MenuItem createChickenWings(){
        return new MenuItemBuilder().setId("KFC_CHICKEN_WINGS").setName("CHICKENWINGS").setBasePrice(400).setType("NONVEG").build();
    }
    public static MenuItem createPopcornChicken(){
        return new MenuItemBuilder().setId("KFC_POPCORN_CHICKEN").setName("POPCORNCHICKEN").setBasePrice(600).setType("NONVEG").build();
    }

    public static List<MenuItem> buildKFCMenu(){
        List<MenuItem> items = new ArrayList<>();
        items.add(MenuFactory.createVegBurger());
        items.add(MenuFactory.createChickenWings());
        items.add(MenuFactory.createPopcornChicken());
        return items;
    }


}
