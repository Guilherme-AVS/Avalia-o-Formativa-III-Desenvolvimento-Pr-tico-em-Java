public class TrianguloConstrutor {
    private double ladoA;
    private double ladoB;
    private double ladoC;

    public TrianguloConstrutor() {
        this(1.0, 1.0, 1.0);
    }

    public TrianguloConstrutor(double ladoA, double ladoB, double ladoC) {
        if (ladoA <= 0 || ladoB <= 0 || ladoC <= 0) {
            throw new IllegalArgumentException("Lados devem ser positivos");
        }
        if (ladoA + ladoB <= ladoC || ladoA + ladoC <= ladoB || ladoB + ladoC <= ladoA) {
            throw new IllegalArgumentException("Lados não formam um triângulo");
        }
        this.ladoA = ladoA;
        this.ladoB = ladoB;
        this.ladoC = ladoC;
    }

    public double perimetro() {
        return ladoA + ladoB + ladoC;
    }

    public static void main(String[] args) {
        System.out.println(new TrianguloConstrutor().perimetro());
        System.out.println(new TrianguloConstrutor(3, 4, 5).perimetro());
    }
}
