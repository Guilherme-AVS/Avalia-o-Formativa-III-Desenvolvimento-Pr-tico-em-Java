public class Desconto {
    public static double calcularDesconto(double preco, int percentual) {
        return preco * (1 - percentual / 100.0);
    }

    public static void main(String[] args) {
        double p1 = calcularDesconto(200.0, 10);
        double p2 = calcularDesconto(150.0, 20);

        System.out.println("Preço 1: " + p1);
        System.out.println("Preço 2: " + p2);
    }
}
