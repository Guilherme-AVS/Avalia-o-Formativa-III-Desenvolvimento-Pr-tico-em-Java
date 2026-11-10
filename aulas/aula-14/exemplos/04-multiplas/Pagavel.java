public interface Pagavel {
    double calcularValor();
    default String gerarRecibo() {
        return "Valor: R$ " + String.format("%.2f", calcularValor());
    }
}
