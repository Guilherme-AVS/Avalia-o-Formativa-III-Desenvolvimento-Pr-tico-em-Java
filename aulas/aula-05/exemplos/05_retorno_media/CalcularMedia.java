public class CalcularMedia {
    public static double calcularMedia(double n1, double n2) {
        return (n1 + n2) / 2.0;
    }

    public static void main(String[] args) {
        double media = calcularMedia(8.0, 9.0);
        System.out.println("Média: " + media);
    }
}
