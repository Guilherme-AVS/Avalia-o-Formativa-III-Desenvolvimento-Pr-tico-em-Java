public class Emprestimo {
    private Livro livro;
    private Usuario usuario;

    public void registrar(Livro livro, Usuario usuario) {
        this.livro = livro;
        this.usuario = usuario;
    }

    public void exibirResumo() {
        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Usuário: " + usuario.getNome());
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

    public static class Usuario {
        private String nome;

        public Usuario(String nome) {
            this.nome = nome;
        }

        public String getNome() {
            return nome;
        }
    }

    public static void main(String[] args) {
        Livro livro = new Livro("Java: Como Programar");
        Usuario usuario = new Usuario("Ana");

        Emprestimo emprestimo = new Emprestimo();
        emprestimo.registrar(livro, usuario);
        emprestimo.exibirResumo();
    }
}
