import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private String nome;
    private List<Livro> acervo = new ArrayList<>();

    public Biblioteca(String nome) {
        this.nome = nome;
    }

    public void adicionarLivro(Livro livro) {
        acervo.add(livro);
    }

    public void listarAcervo() {
        System.out.println("Biblioteca: " + nome);
        for (Livro livro : acervo) {
            System.out.println("- " + livro.getTitulo());
        }
    }

    public static class Livro {
        private String titulo;

        public Livro(String titulo) {
            this.titulo = titulo;
        }

        public String getTitulo() {
            return titulo;
        }
    }

    public static void main(String[] args) {
        Livro livro = new Livro("Clean Code");
        Biblioteca biblioteca = new Biblioteca("UNICAP");

        biblioteca.adicionarLivro(livro);
        biblioteca.listarAcervo();

        // O objeto livro continua existindo independentemente da biblioteca.
        System.out.println("Livro ainda existe: " + livro.getTitulo());
    }
}
