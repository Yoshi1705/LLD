package com.yoshitha.lld.fooddelivery;


import com.yoshitha.lld.fooddelivery.creational.factory.RestaurantFactory;
import com.yoshitha.lld.fooddelivery.decorator.*;
import com.yoshitha.lld.fooddelivery.domain.*;
import com.yoshitha.lld.fooddelivery.service.EmailNotificationService;
import com.yoshitha.lld.fooddelivery.service.SmsNotificationService;
import com.yoshitha.lld.fooddelivery.strategy.*;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Select Restaurant:");
        System.out.println("1. KFC");
        System.out.println("2. McDonald's");
        Scanner scanner = new Scanner(System.in);
        int restaurantChoice = scanner.nextInt();

        RestaurantType restaurantType;
        switch (restaurantChoice) {
            case 1 -> restaurantType = RestaurantType.KFC;
            case 2 -> restaurantType = RestaurantType.MCD;
            default -> throw new IllegalArgumentException("Invalid restaurant choice");
        }

        Restaurant restaurant = RestaurantFactory.createRestaurant(restaurantType);

        System.out.println("Menu:");

        List<MenuItem> menu = restaurant.getMenu();
        for (int i = 0; i < menu.size(); i++) {
            System.out.println((i + 1) + ". " +
                    menu.get(i).getName() + " - ₹" + menu.get(i).getBasePrice());
        }

        int itemChoice = scanner.nextInt();
        MenuItem selectedItem = menu.get(itemChoice - 1);

        System.out.print("Enter quantity: ");
        int quantity = scanner.nextInt();
        FoodItem foodItem = new BaseFoodItem(selectedItem);

        System.out.println(foodItem.getPrice());

        System.out.print("Add Cheese? (Y/N): ");
        if (scanner.next().equalsIgnoreCase("Y")) {
            foodItem = new CheeseDecorator(foodItem);

        }

        System.out.print("Add Coke? (Y/N): ");
        if (scanner.next().equalsIgnoreCase("Y")) {
            foodItem = new CokeDecorator(foodItem);
        }

        System.out.println(foodItem.getPrice());

        System.out.print("Customer type (REGULAR / PREMIUM): ");
        String customerType = scanner.next();

        PriceStrategy strategy;
        if (customerType.equalsIgnoreCase("PREMIUM")) {
            strategy = new PremiumPricing();
        } else {
            strategy = new RegularPricing();
        }

        OrderItem orderItem = new OrderItem(foodItem);
        orderItem.setQuantity(quantity);

        Order order = new Order(strategy);
        order.setOrderId("ORD-" + System.currentTimeMillis());
        order.addItem(orderItem);

        order.addObserver(new EmailNotificationService());
        //order.addObserver(new SmsNotificationService());

        order.orderCreated();
        order.calculatePrice();
        order.orderPaid();
        order.orderPrepared();
        order.orderDelivered();



    }
}