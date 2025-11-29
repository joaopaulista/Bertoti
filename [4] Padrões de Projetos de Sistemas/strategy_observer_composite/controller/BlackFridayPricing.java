package controller;

public class BlackFridayPricing implements IPricingStrategy {
    @Override
    public double calculate(double price) {
        return price * 0.50; // 50% de desconto
    }

    @Override
    public String getStrategyName() {
        return "Black Friday (50% OFF)";
    }
}