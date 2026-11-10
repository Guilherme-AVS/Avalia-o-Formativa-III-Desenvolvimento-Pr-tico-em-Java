public class Pix extends MeioPagamento {
    public Pix(String identificador) { super(identificador); }
    @Override public String processar(double valor) { return "PIX processado: R$" + valor; }
}
