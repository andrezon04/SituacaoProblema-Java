public class Professor extends Usuario {
    public Professor(int id, String nome, String email) {
        super();
    }

    @Override
    void getLimiteEmprestimos() {
        System.out.println("Seu limite é: 5 Livros");
    }
}