public class Gabarito04 {
    public static double calcularDesconto(double preco, int percentual) {
        return preco * (1 - percentual / 100.0);
    }
    public static void main(String[] args) {
        System.out.println(calcularDesconto(200, 10));
        System.out.println(calcularDesconto(150, 20));
    }
}
