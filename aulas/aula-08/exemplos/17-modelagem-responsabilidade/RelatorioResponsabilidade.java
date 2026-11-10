public class RelatorioResponsabilidade {
    static class Livro {
        private String titulo;

        Livro(String titulo) {
            this.titulo = titulo;
        }

        public String getTitulo() {
            return titulo;
        }
    }

    static class RelatorioService {
        public String gerarFicha(Livro livro) {
            return "Ficha: " + livro.getTitulo();
        }
    }

    public static void main(String[] args) {
        Livro livro = new Livro("Clean Code");
        RelatorioService service = new RelatorioService();

        System.out.println(service.gerarFicha(livro));
    }
}
