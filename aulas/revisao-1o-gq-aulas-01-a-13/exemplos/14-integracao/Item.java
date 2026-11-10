public class Item {
    private final String nome;
    private final double preco;
    private final int quantidade;

    public Item(String nome, double preco, int quantidade) {
        this.nome = nome; this.preco = preco; this.quantidade = quantidade;
    }
    public double subtotal() { return preco * quantidade; }
}
