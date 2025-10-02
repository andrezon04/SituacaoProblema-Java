import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca {
    Professor p = new Professor(0, "null", "null");
    Aluno a = new Aluno();
    ArrayList<Livro> livros = new ArrayList<Livro>();
    ArrayList<Usuario> usuario = new ArrayList<Usuario>();
    Scanner sc = new Scanner(System.in);

    public void adicionarLivro(Livro l) {
        while (true) {
            System.out.println("Digite o código, o título e o autor do livro: ");
            livros.add(new Livro(sc.nextLine(), sc.nextLine(), sc.nextLine()));
            System.out.println("Livro adicionado com sucesso!");
            System.out.println("Deseja adicionar outro livro?(s/n)");
            String op = sc.nextLine();
            if (op.equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    public void adcProf() {
        while (true) {
            System.out.println("Digite o id, o nome e o e-mail do usuário: ");
            usuario.add(new Professor(sc.nextInt(), sc.nextLine(), sc.nextLine()));
            System.out.println("Usuário adicionado com sucesso!");
            System.out.println("Deseja adicionar outro usuário?(s/n)");
            String op = sc.nextLine();
            if (op.equalsIgnoreCase("n")) {
                break;
            }
        }
    }

    public void emprestarLivro(Usuario u){
        System.out.println("Digite seu usuário: ");
        u.setNome(sc.nextLine());
    }

    public void devolverLivros(Usuario u, String codigo) {
    }
}