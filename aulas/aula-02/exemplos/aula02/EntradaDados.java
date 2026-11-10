import java.util.Scanner;

public class EntradaDados {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();

        System.out.print("Digite sua altura: ");
        double altura = sc.nextDouble();

        System.out.printf(
            "Ola, %s! Idade: %d, Altura: %.2f%n",
            nome, idade, altura
        );

        sc.close();
    }
}
