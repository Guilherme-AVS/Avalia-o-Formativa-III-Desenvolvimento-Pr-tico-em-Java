public class TurmaExercicio {
    private String estado;
    public TurmaExercicio() { estado = "solução de referência"; }
    public String getEstado() { return estado; }
    public static void main(String[] args) { System.out.println(new TurmaExercicio().getEstado()); }
}
