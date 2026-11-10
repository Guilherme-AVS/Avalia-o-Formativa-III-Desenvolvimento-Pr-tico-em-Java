import java.util.ArrayList;
import java.util.List;

public class BibliotecaSistema {
    static class Livro {
        private String titulo;
        private String autor;
        private boolean emprestado;

        Livro(String titulo, String autor) {
            this.titulo = titulo;
            this.autor = autor;
        }

        public String getTitulo() {
            return titulo;
        }

        public boolean emprestar() {
            if (emprestado) {
                return false;
            }
            emprestado = true;
            return true;
        }

        public void devolver() {
            emprestado = false;
        }

        public boolean estaDisponivel() {
            return !emprestado;
        }
    }

    static class Usuario {
        private String nome;
        private List<Emprestimo> emprestimos = new ArrayList<>();

        Usuario(String nome) {
            this.nome = nome;
        }

        public String getNome() {
            return nome;
        }

        public void adicionarEmprestimo(Emprestimo emprestimo) {
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
            if (!livro.emprestar()) {
                return false;
            }
            usuario.adicionarEmprestimo(this);
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

        public void exibirResumo() {
            System.out.println("Biblioteca: " + nome);
            System.out.println("Livros: " + acervo.size());
            System.out.println("Usuários: " + usuarios.size());
        }
    }

    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca("Biblioteca UNICAP");
        Livro livro = new Livro("Clean Code", "Robert C. Martin");
        Usuario usuario = new Usuario("Ana");

        biblioteca.adicionarLivro(livro);
        biblioteca.adicionarUsuario(usuario);

        Emprestimo emprestimo = new Emprestimo(livro, usuario);
        System.out.println("Empréstimo iniciado: " + emprestimo.iniciar());
        biblioteca.exibirResumo();
        System.out.println("Empréstimos de " + usuario.getNome() + ": "
                + usuario.quantidadeEmprestimos());
    }
}
