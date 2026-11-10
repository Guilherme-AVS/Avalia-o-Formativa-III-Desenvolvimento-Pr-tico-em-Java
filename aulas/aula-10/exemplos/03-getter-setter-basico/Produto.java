public class Produto {
    private String nome;
    private double preco;
    private boolean disponivel;

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }
    public boolean isDisponivel() { return disponivel; }
    public void setDisponivel(boolean disponivel) { this.disponivel = disponivel; }

    public static void main(String[] args) {
        Produto p = new Produto(); p.setNome("Teclado"); p.setPreco(120); p.setDisponivel(true);
        System.out.println(p.getNome()+" "+p.getPreco()+" "+p.isDisponivel());
    }
}
