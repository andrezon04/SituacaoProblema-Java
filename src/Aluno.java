public class Aluno extends Usuario {
    @Override
    void getLimiteEmprestimos() {
        System.out.println("Seu limite é: 2 Livros");
    }
}