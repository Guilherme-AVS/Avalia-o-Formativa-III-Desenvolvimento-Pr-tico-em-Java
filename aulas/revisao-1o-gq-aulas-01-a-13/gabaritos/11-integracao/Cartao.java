public class Cartao extends MeioPagamento {
    public Cartao(String identificador) { super(identificador); }
    @Override public String processar(double valor) { return "Cartão processado: R$" + valor; }
}
