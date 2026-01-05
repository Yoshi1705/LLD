package com.yoshitha.lld.fooddelivery.observer;

public interface OrderSubject {

    public void addObserver(OrderObserver observer);

    public void removeObserver(OrderObserver observer);

    public void notifyObserver();

}
