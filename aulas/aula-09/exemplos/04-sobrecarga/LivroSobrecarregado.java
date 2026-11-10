public class LivroSobrecarregado {
    private String titulo;
    private String autor;
    private int paginas;

    public LivroSobrecarregado() {
        this.titulo = "Sem título";
        this.autor = "Desconhecido";
        this.paginas = 0;
    }

    public LivroSobrecarregado(String titulo) {
        this.titulo = titulo;
        this.autor = "Desconhecido";
        this.paginas = 0;
    }

    public LivroSobrecarregado(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public String toString() {
        return titulo + " | " + autor + " | " + paginas;
    }

    public static void main(String[] args) {
        System.out.println(new LivroSobrecarregado());
        System.out.println(new LivroSobrecarregado("Java POO"));
        System.out.println(new LivroSobrecarregado("Java POO", "João", 350));
    }
}
