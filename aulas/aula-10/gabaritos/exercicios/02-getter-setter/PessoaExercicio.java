public class PessoaExercicio {
    private String estado;
    public PessoaExercicio() { estado = "solução de referência"; }
    public String getEstado() { return estado; }
    public static void main(String[] args) { System.out.println(new PessoaExercicio().getEstado()); }
}
