import java.util.Scanner;

public class ClassificaNotas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a nota do aluno (0-10): ");
        double nota = scanner.nextDouble();

        if (nota >= 9.0) {
            System.out.println("Conceito A - Excelente");
        } else if (nota >= 7.0) {
            System.out.println("Conceito B - Bom");
        } else if (nota >= 5.0) {
            System.out.println("Conceito C - Regular");
        } else if (nota >= 3.0) {
            System.out.println("Conceito D - Insuficiente");
        } else {
            System.out.println("Conceito E - Reprovado");
        }

        scanner.close();
    }
}
