package view;

import controller.IOrderObserver;

public class LogDisplay implements IOrderObserver {
    private String viewName;

    public LogDisplay(String viewName) {
        this.viewName = viewName;
    }

    @Override
    public void update(String orderName, double finalPrice, String strategyUsed) {
        System.out.println("[" + viewName + "] Pedido Processado:");
        System.out.println("   Item: " + orderName);
        System.out.println("   Regra: " + strategyUsed);
        System.out.println("   Total a Pagar: R$ " + finalPrice);
        System.out.println("------------------------------------------------");
    }
}