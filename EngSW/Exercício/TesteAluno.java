package Exercício;

// importa biblioteca de testes


// criação variáveis
public class TesteAluno {
    @Test
    void test() {
        SalaAula fatec = new SalaAula();
        Aluno joao = new Aluno("Joao", "123");
        fatec.cadastrarAluno(joao);
        assertEquals(fatec.getAlunos().size(),1);
    }
}
