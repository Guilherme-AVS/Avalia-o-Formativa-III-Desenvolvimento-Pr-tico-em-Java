public class ContaExercicio {
    private String estado;
    public ContaExercicio() { estado = "solução de referência"; }
    public String getEstado() { return estado; }
    public static void main(String[] args) { System.out.println(new ContaExercicio().getEstado()); }
}
