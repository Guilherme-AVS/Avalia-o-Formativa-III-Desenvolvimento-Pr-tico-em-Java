public class Carro extends Veiculo {
    private final int numPortas;
    public Carro(String marca, int ano, int numPortas) {
        super(marca, ano);
        this.numPortas = numPortas;
    }
    public int getNumPortas() { return numPortas; }
}
