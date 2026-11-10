import java.util.ArrayList;
import java.util.List;

public class BibliotecaListaObjetos {
    static class Livro {
        private String titulo;

        Livro(String titulo) {
            this.titulo = titulo;
        }

        public String getTitulo() {
            return titulo;
        }
    }

    private List<Livro> acervo = new ArrayList<>();

    public void adicionarLivro(Livro livro) {
        acervo.add(livro);
    }

    public void listar() {
        for (Livro livro : acervo) {
            System.out.println(livro.getTitulo());
        }
    }

    public static void main(String[] args) {
        BibliotecaListaObjetos biblioteca = new BibliotecaListaObjetos();
        biblioteca.adicionarLivro(new Livro("Clean Code"));
        biblioteca.adicionarLivro(new Livro("Java: Como Programar"));
        biblioteca.listar();
    }
}
