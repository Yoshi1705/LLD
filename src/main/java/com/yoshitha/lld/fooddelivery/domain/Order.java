package com.yoshitha.lld.fooddelivery.domain;

import com.yoshitha.lld.fooddelivery.observer.*;
import com.yoshitha.lld.fooddelivery.strategy.PriceStrategy;

import java.util.ArrayList;
import java.util.List;

public class Order implements OrderSubject {

    private String orderId;
    private List<OrderItem> items;
    private OrderStatus status;
    PriceStrategy strategy;
    List<OrderObserver> observers;

    public Order(PriceStrategy strategy){
        this.items = new ArrayList<>();
        this.strategy = strategy;
        this.observers = new ArrayList<>();
    }

    public  double calculatePrice(){
        return strategy.calculatePrice(this.items);
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }


    public List<OrderItem> getItems() {
        return new ArrayList<>(items);
    }

    public void addItem(OrderItem item) {
        this.items.add(item);
    }
    @Override
    public void addObserver(OrderObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(OrderObserver observer) {
          observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
       for(int i = 0 ; i < observers.size() ; i++){
           observers.get(i).update(this);
       }
    }

    public void orderCreated(){
       this.status = OrderStatus.CREATED;
       notifyObserver();
    }

    public void orderPrepared(){
        this.status = OrderStatus.PREPARED;
        notifyObserver();
    }

    public void orderPaid() {
        this.status = OrderStatus.PAID;
        notifyObserver();
    }

    public void orderDelivered() {
        this.status = OrderStatus.DELIVERED;
        notifyObserver();
    }

    public  OrderStatus getStatus(){
        return this.status;
    }

    public double getTotalAmount(){
        return calculatePrice();
    }

}
