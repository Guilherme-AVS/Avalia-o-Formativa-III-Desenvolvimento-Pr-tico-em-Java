public interface Pagavel {
 double TAXA_MINIMA=10.0;
 double calcularValor();
 default String gerarRecibo(){ return "Recibo no valor de R$ " + String.format("%.2f", calcularValor()); }
 static boolean validarValor(double valor){ return valor>0; }
}
