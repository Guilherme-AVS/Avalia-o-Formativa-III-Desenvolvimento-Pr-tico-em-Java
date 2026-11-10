public abstract class MeioPagamento {
    private final String identificador;
    public MeioPagamento(String identificador) { this.identificador = identificador; }
    public String getIdentificador() { return identificador; }
    public abstract String processar(double valor);
}
