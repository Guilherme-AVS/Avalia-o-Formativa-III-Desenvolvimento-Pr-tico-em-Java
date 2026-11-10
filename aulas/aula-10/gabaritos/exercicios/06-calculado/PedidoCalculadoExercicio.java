public class PedidoCalculadoExercicio {
    private String estado;
    public PedidoCalculadoExercicio() { estado = "solução de referência"; }
    public String getEstado() { return estado; }
    public static void main(String[] args) { System.out.println(new PedidoCalculadoExercicio().getEstado()); }
}
