public class ProdutoExercicio {
    private String estado;
    public ProdutoExercicio() { estado = "solução de referência"; }
    public String getEstado() { return estado; }
    public static void main(String[] args) { System.out.println(new ProdutoExercicio().getEstado()); }
}
