public class Calculos {
    public static double calcularTaxa(double valor, double percentual) {
        return valor * percentual / 100.0;
    }

    public static void notificar(String mensagem) {
        System.out.println("[ALERTA] " + mensagem);
    }
}
