public class Professor extends Usuario {
    @Override
    void getLimiteEmprestimos() {
        System.out.println("Seu limite é: 5 Livros");
    }
}