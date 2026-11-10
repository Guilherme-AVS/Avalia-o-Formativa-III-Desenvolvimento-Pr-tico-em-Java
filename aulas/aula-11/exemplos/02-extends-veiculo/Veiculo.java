public class Veiculo {
    private final String marca;
    private final int ano;
    public Veiculo(String marca, int ano) { this.marca = marca; this.ano = ano; }
    public String getMarca() { return marca; }
    public int getAno() { return ano; }
    public void exibirInfo() { System.out.println(marca + " (" + ano + ")"); }
}
