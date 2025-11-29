package composite.antipattern;

public class FileCoupled {
    private String name;

    public FileCoupled(String name) {
        this.name = name;
    }

    public void printFile() {
        System.out.println("- Arquivo: " + name);
    }
}