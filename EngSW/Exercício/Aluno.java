package Exercício;
// declaração classe e variável
public class Aluno {
    private String nome;
    private String ra;

    // método construtor e declaração variável ref. objeto da classe
    public Aluno(String nome, String ra) {
        this.nome = nome;
        this.ra = ra;
    }

    // método getter, retorna o valor da variável 'nome'
    public String getNome() {
        return this.nome;
    }

    // método getter, retorna o valor da variável 'ra'
    public String getRa() {
        return this.ra;
    }
}