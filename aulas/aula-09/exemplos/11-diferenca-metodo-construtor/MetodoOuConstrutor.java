public class MetodoOuConstrutor {
    private String nome;

    public MetodoOuConstrutor(String nome) {
        this.nome = nome;
    }

    public void renomear(String novoNome) {
        this.nome = novoNome;
    }

    public void exibir() {
        System.out.println(nome);
    }

    public static void main(String[] args) {
        MetodoOuConstrutor objeto = new MetodoOuConstrutor("Inicial");
        objeto.exibir();
        objeto.renomear("Alterado");
        objeto.exibir();
    }
}
