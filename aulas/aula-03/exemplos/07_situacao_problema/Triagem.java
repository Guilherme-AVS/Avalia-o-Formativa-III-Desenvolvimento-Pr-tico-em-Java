import java.util.Scanner;

public class Triagem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Idade: ");
        int idade = scanner.nextInt();

        System.out.print("Há sintoma de emergência? (true/false): ");
        boolean emergencia = scanner.nextBoolean();

        if (emergencia) {
            System.out.println("Prioridade: emergência");
        } else if (idade >= 65) {
            System.out.println("Prioridade: alta");
        } else {
            System.out.println("Prioridade: padrão");
        }

        scanner.close();
    }
}
