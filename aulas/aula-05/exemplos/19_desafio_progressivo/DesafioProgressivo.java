import java.util.Scanner;

public class DesafioProgressivo {
    public static double lerNumero(Scanner sc, String rotulo) {
        System.out.print(rotulo + ": ");
        return sc.nextDouble();
    }

    public static double calcularSoma(double a, double b) {
        return a + b;
    }

    public static double calcularMedia(double a, double b) {
        return (a + b) / 2.0;
    }

    public static double verificarMaior(double a, double b) {
        return Math.max(a, b);
    }

    public static void exibirResultado(double soma, double media, double maior) {
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
        System.out.println("Maior: " + maior);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double n1 = lerNumero(sc, "Número 1");
        double n2 = lerNumero(sc, "Número 2");

        double soma = calcularSoma(n1, n2);
        double media = calcularMedia(n1, n2);
        double maior = verificarMaior(n1, n2);

        exibirResultado(soma, media, maior);

        sc.close();
    }
}
