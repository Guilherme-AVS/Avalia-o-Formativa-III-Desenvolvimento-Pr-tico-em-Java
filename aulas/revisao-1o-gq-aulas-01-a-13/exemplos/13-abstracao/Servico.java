public abstract class Servico {
    protected String nome;

    public Servico(String nome) { this.nome = nome; }
    public abstract double calcularCusto(int unidades);
    public void exibirNome() { System.out.println(nome); }
}
