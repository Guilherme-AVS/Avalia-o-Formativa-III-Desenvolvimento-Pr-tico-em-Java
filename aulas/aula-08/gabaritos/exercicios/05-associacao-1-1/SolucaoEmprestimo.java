public class SolucaoEmprestimo {
    private Livro livro;
    private Usuario usuario;

    public void registrar(Livro livro, Usuario usuario) {
        this.livro = livro;
        this.usuario = usuario;
    }

    public void exibirResumo() {
        System.out.println(livro.titulo + " → " + usuario.nome);
    }

    static class Livro {
        private String titulo;

        Livro(String titulo) {
            this.titulo = titulo;
        }
    }

    static class Usuario {
        private String nome;

        Usuario(String nome) {
            this.nome = nome;
        }
    }

    public static void main(String[] args) {
        SolucaoEmprestimo e = new SolucaoEmprestimo();
        e.registrar(new Livro("Clean Code"), new Usuario("Ana"));
        e.exibirResumo();
    }
}
