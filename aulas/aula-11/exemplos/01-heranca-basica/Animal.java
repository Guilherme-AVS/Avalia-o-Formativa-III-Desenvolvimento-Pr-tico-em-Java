public class Animal {
    private final String nome;
    public Animal(String nome) { this.nome = nome; }
    public String getNome() { return nome; }
    public void emitirSom() { System.out.println(nome + " faz um som genérico."); }
}
