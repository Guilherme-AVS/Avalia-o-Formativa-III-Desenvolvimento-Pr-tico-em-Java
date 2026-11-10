import java.util.ArrayList;
import java.util.Scanner;

public class GerenciadorAlunos {
    public static void main(String[] args) {
        ArrayList<String> alunos = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        int opcao = 0;

        while (opcao != 5) {
            System.out.println("1 - Adicionar");
            System.out.println("2 - Listar");
            System.out.println("3 - Buscar");
            System.out.println("4 - Remover");
            System.out.println("5 - Sair");
            System.out.print("Opção: ");

            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    alunos.add(sc.nextLine());
                    break;
                case 2:
                    for (String aluno : alunos) {
                        System.out.println(aluno);
                    }
                    break;
                case 3:
                    System.out.print("Nome para buscar: ");
                    String busca = sc.nextLine();
                    System.out.println(alunos.contains(busca) ? "Encontrado" : "Não encontrado");
                    break;
                case 4:
                    System.out.print("Nome para remover: ");
                    alunos.remove(sc.nextLine());
                    break;
                case 5:
                    System.out.println("Encerrando...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }

        sc.close();
    }
}
