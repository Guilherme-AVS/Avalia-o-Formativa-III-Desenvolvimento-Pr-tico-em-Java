public class PeriodoExercicio {
    private String estado;
    public PeriodoExercicio() { estado = "solução de referência"; }
    public String getEstado() { return estado; }
    public static void main(String[] args) { System.out.println(new PeriodoExercicio().getEstado()); }
}
