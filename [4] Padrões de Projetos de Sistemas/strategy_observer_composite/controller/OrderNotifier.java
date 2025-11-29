package controller;

import java.util.ArrayList;
import java.util.List;

public class OrderNotifier {
    private List<IOrderObserver> observers = new ArrayList<>();

    public void attach(IOrderObserver observer) {
        observers.add(observer);
    }

    public void notifyObservers(String orderName, double finalPrice, String strategyUsed) {
        for (IOrderObserver observer : observers) {
            observer.update(orderName, finalPrice, strategyUsed);
        }
    }
}