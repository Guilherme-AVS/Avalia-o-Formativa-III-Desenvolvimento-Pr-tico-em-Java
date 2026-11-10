public class Ponto {
    private int x;
    private int y;

    public Ponto(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Ponto(int x) {
        this(x, 0);
    }

    public Ponto() {
        this(0, 0);
    }

    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    public static void main(String[] args) {
        System.out.println(new Ponto());
        System.out.println(new Ponto(5));
        System.out.println(new Ponto(3, 7));
    }
}
