public class ProdutoThisChain {
    private String nome;
    private double preco;
    private String marca;

    public ProdutoThisChain(String nome, double preco, String marca) {
        this.nome = nome;
        this.preco = preco;
        this.marca = marca;
    }

    public ProdutoThisChain(String nome, double preco) {
        this(nome, preco, "Sem marca");
    }

    public ProdutoThisChain(String nome) {
        this(nome, 0.0, "Sem marca");
    }

    public String toString() {
        return nome + " | R$" + preco + " | " + marca;
    }

    public static void main(String[] args) {
        System.out.println(new ProdutoThisChain("Caneta"));
        System.out.println(new ProdutoThisChain("Caneta", 2.50));
        System.out.println(new ProdutoThisChain("Caneta", 2.50, "BIC"));
    }
}
