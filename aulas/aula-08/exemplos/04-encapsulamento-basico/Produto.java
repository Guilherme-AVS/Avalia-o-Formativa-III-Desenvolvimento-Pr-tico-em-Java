public class Produto {
    private String nome;
    private double preco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public void exibir() {
        System.out.println(nome + " — R$ " + preco);
    }

    public static void main(String[] args) {
        Produto produto = new Produto();
        produto.setNome("Teclado");
        produto.setPreco(149.90);
        produto.exibir();
    }
}
