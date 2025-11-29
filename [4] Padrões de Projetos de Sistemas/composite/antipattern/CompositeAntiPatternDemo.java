package composite.antipattern;

public class CompositeAntiPatternDemo {
    public static void main(String[] args) {
        FileCoupled f1 = new FileCoupled("Dados.txt");
        FileCoupled f2 = new FileCoupled("Imagem.jpg");

        FolderCoupled root = new FolderCoupled("Raiz");
        FolderCoupled sub = new FolderCoupled("SubPasta");

        sub.addFile(f1);

        root.addFile(f2);
        root.addFolder(sub);

        System.out.println("--- Estrutura (Anti-pattern) ---");
        root.printStructure();
    }
}