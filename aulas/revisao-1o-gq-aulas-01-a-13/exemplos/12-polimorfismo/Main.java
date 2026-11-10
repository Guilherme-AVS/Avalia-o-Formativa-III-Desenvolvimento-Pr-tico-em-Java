public class Main {
    public static void main(String[] args) {
        MeioPagamento p1 = new PagamentoPix();
        MeioPagamento p2 = new PagamentoBoleto();
        MeioPagamento p3 = new MeioPagamento();
        p1.processar(200);
        p2.processar(350);
        p3.processar(50);
    }
}
