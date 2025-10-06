package Exercicio;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TesteLeitor {
    @Test
    void test() {
        Biblioteca biblioteca = new Biblioteca();
        Leitor joao = new Leitor("Joao", "123");
        biblioteca.cadastrarLeitor(joao);
        assertEquals(biblioteca.getLeitores().size(), 1);
    }
}
