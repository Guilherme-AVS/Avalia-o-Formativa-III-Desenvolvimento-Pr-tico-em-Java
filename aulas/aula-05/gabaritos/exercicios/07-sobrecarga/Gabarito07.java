public class Gabarito07 {
    public static int somar(int a, int b) { return a + b; }
    public static double somar(double a, double b) { return a + b; }
    public static int somar(int a, int b, int c) { return a + b + c; }
    public static void main(String[] args) {
        System.out.println(somar(1, 2));
        System.out.println(somar(1.5, 2.5));
        System.out.println(somar(1, 2, 3));
    }
}
