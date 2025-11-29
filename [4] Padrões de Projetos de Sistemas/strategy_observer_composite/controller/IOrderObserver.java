package controller;

public interface IOrderObserver {
    void update(String orderName, double finalPrice, String strategyUsed);
}