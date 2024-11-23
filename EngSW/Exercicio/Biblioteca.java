package Exercicio;

import java.util.List;
import java.util.LinkedList;

public class Biblioteca {
    private List<Leitor> leitores = new LinkedList<Leitor>();

    public void cadastrarLeitor(Leitor leitor) {
        leitores.add(leitor);
    }

    public List<Leitor> getLeitores() {
        return leitores;
    }
}
