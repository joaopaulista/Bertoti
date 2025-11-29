package controller;

public class RegularPricing implements IPricingStrategy {
    @Override
    public double calculate(double price) {
        return price; // Sem desconto
    }

    @Override
    public String getStrategyName() {
        return "Preço Regular";
    }
}