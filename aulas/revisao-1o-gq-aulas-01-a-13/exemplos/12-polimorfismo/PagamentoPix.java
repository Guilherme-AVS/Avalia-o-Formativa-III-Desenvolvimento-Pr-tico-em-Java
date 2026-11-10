public class PagamentoPix extends MeioPagamento {
    @Override
    public void processar(double valor) {
        System.out.println("PIX: R$" + valor);
    }
}
