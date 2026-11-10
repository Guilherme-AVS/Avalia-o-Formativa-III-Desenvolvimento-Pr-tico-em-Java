public class Gabarito02 {
    public static double calcularMedia(double a, double b) { return (a + b) / 2.0; }
    public static double calcularMaior(double a, double b) { return Math.max(a, b); }
    public static double calcularMenor(double a, double b) { return Math.min(a, b); }
    public static void main(String[] args) {
        System.out.println(calcularMedia(8, 9));
        System.out.println(calcularMaior(8, 9));
        System.out.println(calcularMenor(8, 9));
    }
}
