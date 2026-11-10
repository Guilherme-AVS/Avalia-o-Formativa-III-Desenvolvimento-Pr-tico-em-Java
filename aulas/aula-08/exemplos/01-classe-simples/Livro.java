public class Livro {
    private String titulo;
    private String autor;

    public void exibirInformacoes() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
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

    public static void main(String[] args) {
        Livro livro = new Livro();
        livro.setTitulo("Clean Code");
        livro.setAutor("Robert C. Martin");
        livro.exibirInformacoes();
    }
}
