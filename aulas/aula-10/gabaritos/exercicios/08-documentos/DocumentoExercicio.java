public class DocumentoExercicio {
    private String estado;
    public DocumentoExercicio() { estado = "solução de referência"; }
    public String getEstado() { return estado; }
    public static void main(String[] args) { System.out.println(new DocumentoExercicio().getEstado()); }
}
