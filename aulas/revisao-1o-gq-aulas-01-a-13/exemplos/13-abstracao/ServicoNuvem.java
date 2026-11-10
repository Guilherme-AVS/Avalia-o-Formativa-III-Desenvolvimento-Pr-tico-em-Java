public class ServicoNuvem extends Servico {
    private double precoPorGB;

    public ServicoNuvem(String nome, double precoPorGB) {
        super(nome);
        this.precoPorGB = precoPorGB;
    }

    @Override
    public double calcularCusto(int unidades) {
        return unidades * precoPorGB;
    }
}
