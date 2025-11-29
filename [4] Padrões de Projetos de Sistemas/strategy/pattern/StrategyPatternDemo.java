package strategy.pattern;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        double totalPurchase = 150.00;

        cart.setPaymentStrategy(new PixPayment("email@exemplo.com"));
        cart.checkout(totalPurchase);

        System.out.println("--- Mudando método de pagamento ---");

        cart.setPaymentStrategy(new CreditCardPayment("1234-5678-9012-3456", "999"));
        cart.checkout(totalPurchase);
    }
}