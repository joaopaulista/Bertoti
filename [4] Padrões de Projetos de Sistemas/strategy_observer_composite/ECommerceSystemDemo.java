import controller.BlackFridayPricing;
import controller.OrderContext;
import controller.RegularPricing;
import model.ProductBundle;
import model.SingleProduct;
import view.LogDisplay;

public class ECommerceSystemDemo {
    public static void main(String[] args) {
        // --- 1. Configuração do Composite (Criando os produtos) ---
        SingleProduct p1 = new SingleProduct("Notebook Gamer", 5000.00);
        SingleProduct p2 = new SingleProduct("Mouse RGB", 200.00);
        SingleProduct p3 = new SingleProduct("Teclado Mecânico", 300.00);
        SingleProduct p4 = new SingleProduct("Monitor 144hz", 1500.00);

        // Criando um Kit (Composite contendo Leafs)
        ProductBundle kitGamer = new ProductBundle("Kit Pro Player");
        kitGamer.addItem(p1);
        kitGamer.addItem(p2);
        kitGamer.addItem(p3);

        // Criando um Super Kit (Composite contendo outro Composite + Leaf)
        ProductBundle superBundle = new ProductBundle("Setup Completo (Com Monitor)");
        superBundle.addItem(kitGamer); // Adiciona o kit anterior
        superBundle.addItem(p4);       // Adiciona o monitor avulso

        // --- 2. Configuração do Observer e Strategy (Controller) ---
        OrderContext orderSystem = new OrderContext();

        // As "telas" que ficarão escutando
        orderSystem.addObserver(new LogDisplay("Tela do Cliente"));
        orderSystem.addObserver(new LogDisplay("Sistema de Logística"));

        // --- 3. Execução ---

        System.out.println(">>> Cenario 1: Compra avulsa, Preço Normal <<<");
        orderSystem.setStrategy(new RegularPricing());
        orderSystem.processOrder(p1); // Processa Leaf

        System.out.println("\n>>> Cenario 2: Compra de Kit, Black Friday <<<");
        orderSystem.setStrategy(new BlackFridayPricing());
        // O Composite calcula o total de tudo recursivamente, a Strategy aplica 50%
        // e os Observers imprimem o resultado
        orderSystem.processOrder(superBundle);
    }
}