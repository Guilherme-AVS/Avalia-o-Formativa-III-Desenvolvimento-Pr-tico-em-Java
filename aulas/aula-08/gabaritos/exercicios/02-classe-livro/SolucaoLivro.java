public class SolucaoLivro {
    private String titulo;
    private String autor;
    private String isbn;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void exibirInformacoes() {
        System.out.println(titulo + " — " + autor + " — " + isbn);
    }

    public static void main(String[] args) {
        SolucaoLivro livro = new SolucaoLivro();
        livro.setTitulo("Clean Code");
        livro.setAutor("Robert C. Martin");
        livro.setIsbn("9780132350884");
        livro.exibirInformacoes();
    }
}
