public class ItemBiblioteca {
    private final String titulo;
    private final String codigo;
    private final int anoPublicacao;
    private Emprestimo emprestimo;
    public ItemBiblioteca(String titulo, String codigo, int anoPublicacao) { this.titulo=titulo; this.codigo=codigo; this.anoPublicacao=anoPublicacao; }
    public String getTitulo(){return titulo;} public String getCodigo(){return codigo;} public int getAnoPublicacao(){return anoPublicacao;}
    public void emprestar(String usuario){ emprestimo = new Emprestimo(usuario); }
    @Override public String toString(){return "ItemBiblioteca{titulo='"+titulo+"', codigo='"+codigo+"', ano="+anoPublicacao+", emprestimo="+emprestimo+"}";}
}
