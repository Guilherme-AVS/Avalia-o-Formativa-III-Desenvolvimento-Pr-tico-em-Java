import java.util.Scanner;

public class VerificaIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("Acesso permitido!");
            System.out.println("Bem-vindo ao sistema.");
        }

        System.out.println("Verificação concluída.");
        scanner.close();
    }
}
