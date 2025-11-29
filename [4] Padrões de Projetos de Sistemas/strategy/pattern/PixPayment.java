package strategy.pattern;

public class PixPayment implements PaymentStrategy {
    private String pixKey;

    public PixPayment(String pixKey) {
        this.pixKey = pixKey;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Pagamento de R$ " + amount + " realizado via PIX para chave: " + pixKey);
    }
}