import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Valor da compra: ");
        double valor = scanner.nextDouble();

        System.out.print("É cliente fiel? (true/false): ");
        boolean clienteFiel = scanner.nextBoolean();

        double percentual;

        if (valor >= 500 && clienteFiel) {
            percentual = 0.15;
        } else if (valor >= 500 || clienteFiel) {
            percentual = 0.10;
        } else {
            percentual = 0.05;
        }

        double desconto = valor * percentual;
        double total = valor - desconto;

        System.out.printf("Desconto: R$ %.2f%n", desconto);
        System.out.printf("Total: R$ %.2f%n", total);

        scanner.close();
    }
}
