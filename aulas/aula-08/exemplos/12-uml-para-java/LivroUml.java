public class LivroUml {
    private String titulo;
    private String autor;
    private String isbn;

    public void emprestar() {
        System.out.println("Livro emprestado: " + titulo);
    }

    public void devolver() {
        System.out.println("Livro devolvido: " + titulo);
    }

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

    public static void main(String[] args) {
        LivroUml livro = new LivroUml();
        livro.setTitulo("Design Patterns");
        livro.setAutor("Gamma");
        livro.setIsbn("978-0201633610");
        livro.emprestar();
        livro.devolver();
    }
}
