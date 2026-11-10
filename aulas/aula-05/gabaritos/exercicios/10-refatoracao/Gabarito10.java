import java.util.Scanner;

public class Gabarito10 {
    public static double lerNota(Scanner sc, String rotulo) {
        System.out.print(rotulo + ": ");
        return sc.nextDouble();
    }
    public static double calcularMedia(double a, double b) {
        return (a + b) / 2.0;
    }
    public static void exibirResultado(double media) {
        System.out.println(media >= 7 ? "Aprovado" : "Reprovado");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n1 = lerNota(sc, "Nota 1");
        double n2 = lerNota(sc, "Nota 2");
        exibirResultado(calcularMedia(n1, n2));
        sc.close();
    }
}
