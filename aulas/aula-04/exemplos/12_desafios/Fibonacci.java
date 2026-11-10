import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos termos? ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Informe um número positivo.");
            scanner.close();
            return;
        }

        int a = 0;
        int b = 1;

        for (int i = 1; i <= n; i++) {
            String paridade = (a % 2 == 0) ? "par" : "ímpar";
            System.out.println("Termo " + i + ": " + a + " (" + paridade + ")");

            int temp = a + b;
            a = b;
            b = temp;
        }

        scanner.close();
    }
}
