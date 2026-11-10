public class Ponto {
    private int x;
    private int y;

    public Ponto() {
        this(0, 0);
    }

    public Ponto(int x) {
        this(x, 0);
    }

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public static void main(String[] args) {
        Ponto p1 = new Ponto();
        Ponto p2 = new Ponto(5);
        Ponto p3 = new Ponto(3, 7);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
