public class PagamentoBoleto extends MeioPagamento {
    @Override
    public void processar(double valor) {
        System.out.println("Boleto: R$" + valor);
    }
}
