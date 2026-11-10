package app;

import model.Livro;
import service.BibliotecaService;
import service.LivroNaoEncontradoException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BibliotecaService biblioteca = new BibliotecaService();

        
        biblioteca.cadastrarLivro(new Livro("001", "Java Como Programar", "Deitel"));
        biblioteca.cadastrarLivro(new Livro("002", "Clean Code", "Robert C. Martin"));
        biblioteca.cadastrarLivro(new Livro("003", "Padrões de Projeto", "GoF"));

        int opcao = 0;
        do {
            System.out.println("\n=== Sistema de Biblioteca ===");
            System.out.println("1. Cadastrar novo livro");
            System.out.println("2. Listar livros");
            System.out.println("3. Buscar livro pelo código");
            System.out.println("4. Emprestar livro");
            System.out.println("5. Devolver livro");
            System.out.println("6. Sair");
            System.out.print("Escolha uma opção: ");
            
            if (scanner.hasNextInt()) {
                opcao = scanner.nextInt();
                scanner.nextLine(); 
            } else {
                System.out.println("Entrada inválida. Digite um número.");
                scanner.nextLine();
                continue;
            }

            switch (opcao) {
                case 1:
                    System.out.print("Código: ");
                    String codigo = scanner.nextLine();
                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Autor: ");
                    String autor = scanner.nextLine();
                    biblioteca.cadastrarLivro(new Livro(codigo, titulo, autor));
                    break;
                case 2:
                    System.out.println("\n--- Acervo ---");
                    biblioteca.listarLivros();
                    break;
                case 3:
                    System.out.print("Digite o código para busca: ");
                    String codBusca = scanner.nextLine();
                    try {
                        Livro livro = biblioteca.buscarLivro(codBusca);
                        System.out.println("Encontrado: " + livro);
                    } catch (LivroNaoEncontradoException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;
                case 4:
                    System.out.print("Digite o código para empréstimo: ");
                    String codEmprestimo = scanner.nextLine();
                    try {
                        Livro livro = biblioteca.buscarLivro(codEmprestimo);
                        livro.emprestar();
                    } catch (LivroNaoEncontradoException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;
                case 5:
                    System.out.print("Digite o código para devolução: ");
                    String codDevolucao = scanner.nextLine();
                    try {
                        Livro livro = biblioteca.buscarLivro(codDevolucao);
                        livro.devolver();
                    } catch (LivroNaoEncontradoException e) {
                        System.out.println("Erro: " + e.getMessage());
                    }
                    break;
                case 6:
                    System.out.println("Encerrando o sistema...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 6);

        scanner.close();
    }
}