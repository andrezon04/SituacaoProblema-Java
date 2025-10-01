import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca b = new Biblioteca();

        while (true) {
            System.out.println("---------Sistema Biblioteca---------");
            System.out.println("\nQual operação deseja realizar:");
            System.out.println("1. Adicionar Usuário");
            System.out.println("2. Adicionar Livro");
            System.out.println("3. Realizar Operações(empréstimo/devolução");
            System.out.println("4. Ver livros adicionados");
            System.out.println("5. Ver usuários adicionados");
            System.out.println("0. Sair");
            int op = sc.nextInt();

            switch (op) {
                case 1:
                b.adicionarLivro(new Livro("empty", "empty", "empty"));
                System.out.println(b.livros);
                case 2:

                case 3:

                case 4:

                case 5:

                case 0:
                System.out.println("Saindo do programa...");
                    break;
            }
        }
    }
}