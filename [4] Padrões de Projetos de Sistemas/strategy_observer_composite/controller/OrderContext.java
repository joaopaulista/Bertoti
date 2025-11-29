package controller;

import model.IProductItem;

public class OrderContext {
    private IPricingStrategy strategy;
    private OrderNotifier notifier;

    public OrderContext() {
        this.strategy = new RegularPricing(); // Estratégia padrão
        this.notifier = new OrderNotifier();
    }

    public void setStrategy(IPricingStrategy strategy) {
        this.strategy = strategy;
    }

    public void addObserver(IOrderObserver observer) {
        notifier.attach(observer);
    }

    // Método principal que une os 3 padrões
    public void processOrder(IProductItem item) {
        // 1. COMPOSITE: Obtém o preço base (seja item único ou kit complexo)
        double basePrice = item.getPrice();

        // 2. STRATEGY: Aplica a regra de desconto atual
        double finalPrice = strategy.calculate(basePrice);

        // 3. OBSERVER: Notifica as views sobre o resultado
        notifier.notifyObservers(item.getName(), finalPrice, strategy.getStrategyName());
    }
}