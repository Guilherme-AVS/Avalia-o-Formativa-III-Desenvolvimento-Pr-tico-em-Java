import java.util.Scanner;

public class NotasModularizadas {
    public static double lerNota(Scanner sc, String rotulo) {
        System.out.print(rotulo + ": ");
        return sc.nextDouble();
    }

    public static double calcularMedia(double n1, double n2) {
        return (n1 + n2) / 2.0;
    }

    public static void exibirResultado(double media) {
        if (media >= 7.0) {
            System.out.println("Aprovado! Média: " + media);
        } else {
            System.out.println("Reprovado. Média: " + media);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1 = lerNota(sc, "Nota 1");
        double n2 = lerNota(sc, "Nota 2");
        double media = calcularMedia(n1, n2);

        exibirResultado(media);

        sc.close();
    }
}
