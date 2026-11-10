public class PessoaNormalizadaExercicio {
    private String estado;
    public PessoaNormalizadaExercicio() { estado = "solução de referência"; }
    public String getEstado() { return estado; }
    public static void main(String[] args) { System.out.println(new PessoaNormalizadaExercicio().getEstado()); }
}
