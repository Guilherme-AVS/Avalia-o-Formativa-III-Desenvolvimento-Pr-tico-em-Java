public class Main {
    public static void main(String[] args) {
        Pagamento p = new Pix();
        p.processar();
        p.processar(120.0);
    }
}
