package com.yoshitha.lld.fooddelivery.service;

import com.yoshitha.lld.fooddelivery.domain.Order;
import com.yoshitha.lld.fooddelivery.observer.OrderObserver;

public class SmsNotificationService implements OrderObserver {

    @Override
    public void update(Order order) {
        String message;

        switch (order.getStatus()) {

            case CREATED -> {
                message = "Order Confirmation – " + order.getOrderId() + "\n\n" +
                        "Hi,\n\n" +
                        "Your order has been successfully placed";
            }

            case PAID -> {
                message = "We have received your payment for order – " + order.getOrderId() ;
            }

            case PREPARED -> {
                message = "Your Order is Ready – " + order.getOrderId() + "\n\n" +
                        "and will be delivered soon";
            }

            case DELIVERED -> {
                message = "Order – " + order.getOrderId() + "\n\n" +
                        "Delivered successfully! Enjoy your meal";
            }

            default -> {
                message = "Order " + order.getOrderId() +
                        " status updated. Please check the app for details.";
            }
        }
        System.out.println(message);
    }
}
