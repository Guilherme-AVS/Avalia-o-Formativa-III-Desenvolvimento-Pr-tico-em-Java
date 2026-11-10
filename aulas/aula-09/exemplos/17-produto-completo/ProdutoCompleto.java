public class ProdutoCompleto {
    private String nome;
    private double preco;
    private String marca;

    public ProdutoCompleto(String nome, double preco, String marca) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome obrigatório");
        }
        if (preco < 0) {
            throw new IllegalArgumentException("Preço não pode ser negativo");
        }
        this.nome = nome;
        this.preco = preco;
        this.marca = (marca == null || marca.isBlank()) ? "Sem marca" : marca;
    }

    public ProdutoCompleto(String nome, double preco) {
        this(nome, preco, "Sem marca");
    }

    public ProdutoCompleto(String nome) {
        this(nome, 0.0, "Sem marca");
    }

    public String toString() {
        return nome + " | R$" + preco + " | " + marca;
    }

    public static void main(String[] args) {
        System.out.println(new ProdutoCompleto("Caneta"));
        System.out.println(new ProdutoCompleto("Caneta", 2.50));
        System.out.println(new ProdutoCompleto("Caneta", 2.50, "BIC"));
    }
}
