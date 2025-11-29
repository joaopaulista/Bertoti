package strategy.antipattern;

public class ShoppingCartCoupled {
    private String paymentMethod;

    private String pixKey;
    private String cardNumber;
    private String cvv;

    public void setPaymentMethod(String method) {
        this.paymentMethod = method;
    }

    public void setPixDetails(String key) {
        this.pixKey = key;
    }

    public void setCardDetails(String number, String cvv) {
        this.cardNumber = number;
        this.cvv = cvv;
    }

    public void checkout(double amount) {
        if ("PIX".equalsIgnoreCase(paymentMethod)) {
            System.out.println("Lógica complexa do PIX aqui: R$ " + amount + " para " + pixKey);
        } else if ("CREDIT_CARD".equalsIgnoreCase(paymentMethod)) {
            System.out.println("Lógica complexa do Cartão aqui: R$ " + amount + " no cartão " + cardNumber);
        } else {
            System.out.println("Método desconhecido.");
        }

    }
}