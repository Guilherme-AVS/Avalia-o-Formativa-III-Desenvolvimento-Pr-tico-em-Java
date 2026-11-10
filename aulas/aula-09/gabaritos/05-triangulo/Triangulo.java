public class Triangulo {
    private double ladoA;
    private double ladoB;
    private double ladoC;

    public Triangulo(double a, double b, double c) {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalArgumentException("Lados devem ser positivos");
        }
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalArgumentException("Lados inválidos");
        }
        this.ladoA = a;
        this.ladoB = b;
        this.ladoC = c;
    }

    public Triangulo() {
        this(1.0, 1.0, 1.0);
    }

    public static void main(String[] args) {
        System.out.println(new Triangulo());
        System.out.println(new Triangulo(3, 4, 5));
    }
}
