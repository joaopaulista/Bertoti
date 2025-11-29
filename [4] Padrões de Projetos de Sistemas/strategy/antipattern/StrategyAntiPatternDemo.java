package strategy.antipattern;

public class StrategyAntiPatternDemo {
    public static void main(String[] args) {
        ShoppingCartCoupled cart = new ShoppingCartCoupled();

        cart.setPaymentMethod("PIX");
        cart.setPixDetails("chave@pix.com.br");

        cart.checkout(100.00);

        cart.setPaymentMethod("CREDIT_CARD");
        cart.setCardDetails("1234-1234-1234-1234", "123");
        cart.checkout(100.00);
    }
}