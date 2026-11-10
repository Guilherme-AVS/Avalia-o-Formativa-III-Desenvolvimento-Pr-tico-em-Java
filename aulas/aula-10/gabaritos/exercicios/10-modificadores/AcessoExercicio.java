public class AcessoExercicio {
    private String estado;
    public AcessoExercicio() { estado = "solução de referência"; }
    public String getEstado() { return estado; }
    public static void main(String[] args) { System.out.println(new AcessoExercicio().getEstado()); }
}
