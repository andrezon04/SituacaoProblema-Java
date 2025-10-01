import java.util.ArrayList;
import java.util.Scanner;

public class Biblioteca{
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

    public void emprestarLivro(Usuario u) {
        System.out.println("Digite seu usuário: ");

    }

    public void devolverLivros(Usuario u, String codigo){
    }
}