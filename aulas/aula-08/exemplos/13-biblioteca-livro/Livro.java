public class Livro {
    private String titulo;
    private String autor;
    private String isbn;
    private boolean emprestado;

    public boolean emprestar() {
        if (!emprestado) {
            emprestado = true;
            return true;
        }
        return false;
    }

    public void devolver() {
        emprestado = false;
    }

    public boolean estaDisponivel() {
        return !emprestado;
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
        Livro livro = new Livro();
        livro.setTitulo("Clean Code");
        livro.setAutor("Robert C. Martin");
        livro.setIsbn("9780132350884");

        System.out.println("Disponível: " + livro.estaDisponivel());
        livro.emprestar();
        System.out.println("Disponível: " + livro.estaDisponivel());
    }
}
