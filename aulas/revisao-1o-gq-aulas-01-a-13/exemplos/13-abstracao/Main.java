public class Main {
    public static void main(String[] args) {
        Servico s = new ServicoNuvem("Storage Pro", 0.15);
        s.exibirNome();
        System.out.println(s.calcularCusto(500));
    }
}
