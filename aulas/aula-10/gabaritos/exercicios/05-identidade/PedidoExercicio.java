public class PedidoExercicio {
    private String estado;
    public PedidoExercicio() { estado = "solução de referência"; }
    public String getEstado() { return estado; }
    public static void main(String[] args) { System.out.println(new PedidoExercicio().getEstado()); }
}
