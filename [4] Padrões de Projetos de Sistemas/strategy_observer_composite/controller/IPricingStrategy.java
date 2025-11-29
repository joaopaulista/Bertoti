package controller;

public interface IPricingStrategy {
    double calculate(double price);
    String getStrategyName();
}