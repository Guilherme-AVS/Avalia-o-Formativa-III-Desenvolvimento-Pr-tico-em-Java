public class Emprestimo {
    private Livro livro;
    private Usuario usuario;

    public void registrar(Livro livro, Usuario usuario) {
        this.livro = livro;
        this.usuario = usuario;
    }

    public static class Livro {
        private String titulo;

        public Livro(String titulo) {
            this.titulo = titulo;
        }
    }

    public static class Usuario {
        private String nome;

        public Usuario(String nome) {
            this.nome = nome;
        }
    }

    public static void main(String[] args) {
        Emprestimo emprestimo = new Emprestimo();
        emprestimo.registrar(new Livro("Livro"), new Usuario("Usuário"));
        System.out.println("Associação 1:1 criada.");
    }
}
