import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<MeioPagamento> meios = new ArrayList<>();
        meios.add(new Pix("PIX-01"));
        meios.add(new Cartao("CARD-01"));
        for (MeioPagamento meio : meios) {
            System.out.println(meio.getIdentificador());
            System.out.println(meio.processar(150.0));
        }
    }
}
