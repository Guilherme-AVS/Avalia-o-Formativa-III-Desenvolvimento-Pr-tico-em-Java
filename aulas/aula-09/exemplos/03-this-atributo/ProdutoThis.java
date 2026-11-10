public class ProdutoThis {
    private String nome;
    private double preco;

    public ProdutoThis(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public void exibir() {
        System.out.println(nome + " | R$ " + preco);
    }

    public static void main(String[] args) {
        ProdutoThis produto = new ProdutoThis("Caneta", 2.50);
        produto.exibir();
    }
}
