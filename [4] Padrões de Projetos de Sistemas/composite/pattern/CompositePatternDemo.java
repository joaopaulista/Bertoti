package composite.pattern;

public class CompositePatternDemo {
    public static void main(String[] args) {

        FileSystemItem file1 = new File("Relatorio.pdf");
        FileSystemItem file2 = new File("Foto.png");
        FileSystemItem file3 = new File("Planilha.xls");

        Folder root = new Folder("Meus Documentos");
        Folder subFolder = new Folder("Trabalho");

        subFolder.add(file1);
        subFolder.add(file3);

        root.add(file2);
        root.add(subFolder);

        System.out.println("--- Estrutura de Arquivos (Composite) ---");
        root.print("");
    }
}