import java.util.ArrayList;
import java.util.List;

public class BibliotecaGabarito {
    static class Livro {
        private String titulo;
        private String autor;
        private boolean emprestado;

        Livro(String titulo, String autor) {
            this.titulo = titulo;
            this.autor = autor;
        }

        public boolean emprestar() {
            if (emprestado) return false;
            emprestado = true;
            return true;
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
    }

    static class Usuario {
        private String nome;
        private List<Emprestimo> emprestimos = new ArrayList<>();

        Usuario(String nome) {
            this.nome = nome;
        }

        public void registrar(Emprestimo emprestimo) {
            emprestimos.add(emprestimo);
        }

        public int quantidadeEmprestimos() {
            return emprestimos.size();
        }
    }

    static class Emprestimo {
        private Livro livro;
        private Usuario usuario;

        Emprestimo(Livro livro, Usuario usuario) {
            this.livro = livro;
            this.usuario = usuario;
        }

        public boolean iniciar() {
            if (!livro.emprestar()) return false;
            usuario.registrar(this);
            return true;
        }
    }

    static class Biblioteca {
        private String nome;
        private List<Livro> acervo = new ArrayList<>();
        private List<Usuario> usuarios = new ArrayList<>();

        Biblioteca(String nome) {
            this.nome = nome;
        }

        public void adicionarLivro(Livro livro) {
            acervo.add(livro);
        }

        public void adicionarUsuario(Usuario usuario) {
            usuarios.add(usuario);
        }
    }

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("UNICAP");
        Livro livro = new Livro("Clean Code", "Robert C. Martin");
        Usuario usuario = new Usuario("Ana");

        biblioteca.adicionarLivro(livro);
        biblioteca.adicionarUsuario(usuario);

        Emprestimo emprestimo = new Emprestimo(livro, usuario);
        System.out.println("Empréstimo: " + emprestimo.iniciar());
        System.out.println("Quantidade do usuário: " + usuario.quantidadeEmprestimos());
    }
}
