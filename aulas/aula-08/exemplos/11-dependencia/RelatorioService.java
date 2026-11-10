public class RelatorioService {
    public String gerarFicha(Livro livro) {
        return "Título: " + livro.getTitulo()
                + "\nAutor: " + livro.getAutor();
    }

    public static class Livro {
        private String titulo;
        private String autor;

        public Livro(String titulo, String autor) {
            this.titulo = titulo;
            this.autor = autor;
        }

        public String getTitulo() {
            return titulo;
        }

        public String getAutor() {
            return autor;
        }
    }

    public static void main(String[] args) {
        RelatorioService service = new RelatorioService();
        Livro livro = new Livro("Java: Como Programar", "Deitel");

        System.out.println(service.gerarFicha(livro));
    }
}
