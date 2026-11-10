public class Produto {
    private String nome;
    private double preco;
    private int estoque;

    public Produto() {
        this("Sem nome", 0.0, 0);
    }

    public Produto(String nome, double preco, int estoque) {
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public String resumo() {
        return nome + " - R$" + preco + " [" + estoque + " un]";
    }
}
