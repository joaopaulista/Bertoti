package Exercicio;

public class Leitor {
    private String nome;
    private String id;

    public Leitor(String nome, String id) {
        this.nome = nome;
        this.id = id;
    }

    public String getNome() {
        return this.nome;
    }

    public String getId() {
        return this.id;
    }
}
