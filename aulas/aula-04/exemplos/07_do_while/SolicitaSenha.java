import java.util.Scanner;

public class SolicitaSenha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String senha;

        do {
            System.out.print("Digite a senha: ");
            senha = scanner.nextLine();
        } while (!senha.equals("1234"));

        System.out.println("Acesso liberado!");
        scanner.close();
    }
}
