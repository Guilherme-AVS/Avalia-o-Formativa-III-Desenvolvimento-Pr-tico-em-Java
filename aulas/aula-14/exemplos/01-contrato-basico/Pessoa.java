public class Pessoa implements Falavel {
    private final String nome;
    public Pessoa(String nome) { this.nome = nome; }
    @Override public void falar() { System.out.println(nome + " fala português."); }
    @Override public String getIdioma() { return "Português"; }
}
