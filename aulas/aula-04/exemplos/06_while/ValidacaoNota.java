import java.util.Scanner;

public class ValidacaoNota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite uma nota entre 0 e 10: ");
        double nota = scanner.nextDouble();

        while (nota < 0 || nota > 10) {
            System.out.print("Valor inválido. Digite novamente: ");
            nota = scanner.nextDouble();
        }

        System.out.println("Nota aceita: " + nota);
        scanner.close();
    }
}
