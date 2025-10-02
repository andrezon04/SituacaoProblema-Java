import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Biblioteca b = new Biblioteca();

        int op = 1;
        while (op != 0) {
            System.out.println("---------Sistema Biblioteca---------");
            System.out.println("Qual operação deseja realizar:");
            System.out.println("1. Adicionar Livro");
            System.out.println("2. Cadastrar Usuário");
            System.out.println("3. Realizar Operações(empréstimo/devolução)");
            System.out.println("4. Ver livros adicionados");
            System.out.println("5. Ver usuários adicionados");
            System.out.println("0. Sair");
            System.out.println("---------Sistema Biblioteca---------\n");
            op = sc.nextInt();

            switch (op) {
                case 1:
                    b.adicionarLivro(new Livro("empty", "empty", "empty"));
                    System.out.println("\nLivro(s) Adicionado(s): " + "\n" + b.livros);
                    break;
                case 2:
                    int o = 0;
                    System.out.println("Cadastrar \n(1)Professor\n(2)Aluno");
                    o = sc.nextInt();
                    switch (o) {
                        case 1:
                            b.adcProf();
                    }
                    break;
                case 3:
                    break;
                case 4:
                    System.out.println("Livro(s) Adicionado(s)");
                    for (Livro l : b.livros) {
                        System.out.println(l);
                    }
                    break;
                case 5:
                    System.out.println("Usuário(s) Adicionado(s)");
                    for (Usuario u : b.usuario) {
                        System.out.println(u);
                    }
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
            }
        }
    }
}