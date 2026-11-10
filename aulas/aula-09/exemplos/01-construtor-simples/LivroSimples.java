public class LivroSimples {
    private String titulo;
    private String autor;
    private int paginas;

    public LivroSimples() {
        this.titulo = "Sem título";
        this.autor = "Desconhecido";
        this.paginas = 0;
    }

    public void exibir() {
        System.out.println(titulo + " | " + autor + " | " + paginas + " páginas");
    }

    public static void main(String[] args) {
        LivroSimples livro = new LivroSimples();
        livro.exibir();
    }
}
