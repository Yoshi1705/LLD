package com.yoshitha.lld.fooddelivery.service;

import com.yoshitha.lld.fooddelivery.domain.Order;
import com.yoshitha.lld.fooddelivery.observer.OrderObserver;

public class EmailNotificationService implements OrderObserver {

    @Override
    public void update(Order order) {

        String message;

        switch (order.getStatus()) {

            case CREATED -> {
                message = "Subject: Order Confirmation – " + order.getOrderId() + "\n\n" +
                        "Hi,\n\n" +
                        "Your order has been successfully placed.\n" +
                        "We are processing your order and will notify you once it is prepared.\n\n" +
                        "Thank you for choosing us!";
            }

            case PAID -> {
                message = "Subject: Payment Successful – " + order.getOrderId() + "\n\n" +
                        "Hi,\n" +
                        "We have received your payment for order " + order.getOrderId() + ".\n" +
                        "Total amount paid: ₹" + order.getTotalAmount() + "\n" +
                        "Your order is now being prepared.";
            }

            case PREPARED -> {
                message = "Subject: Your Order is Ready – " + order.getOrderId() + "\n\n" +
                        "Hi,\n" +
                        "Good news! Your order has been prepared successfully.\n" +
                        "It will be out for delivery shortly.\n\n" +
                        "Thank you for your patience.";
            }

            case DELIVERED -> {
                message = "Subject: Order Delivered – " + order.getOrderId() + "\n\n" +
                        "Hi,\n" +
                        "Your order has been delivered successfully.\n" +
                        "We hope you enjoy your meal 😊\n\n" +
                        "Thank you for choosing us!";
            }

            default -> {
                message = "Order " + order.getOrderId() +
                        " status updated. Please check the app for details.";
            }
        }

        // Demo purpose
        System.out.println(message);
    }
}
