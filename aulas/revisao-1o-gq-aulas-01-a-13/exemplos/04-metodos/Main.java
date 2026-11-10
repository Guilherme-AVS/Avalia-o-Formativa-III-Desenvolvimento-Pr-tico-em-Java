public class Main {
    public static void main(String[] args) {
        double taxa = Calculos.calcularTaxa(1000.0, 2.5);
        System.out.println(taxa);
        Calculos.notificar("Pedido entregue!");
    }
}
