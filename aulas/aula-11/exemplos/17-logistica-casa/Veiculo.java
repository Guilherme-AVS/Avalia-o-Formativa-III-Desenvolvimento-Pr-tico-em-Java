public class Veiculo {
    private final String placa; private final double capacidadeKg; private final int velocidadeMaxima;
    public Veiculo(String placa,double capacidadeKg,int velocidadeMaxima){this.placa=placa;this.capacidadeKg=capacidadeKg;this.velocidadeMaxima=velocidadeMaxima;}
    public String getPlaca(){return placa;} public double getCapacidadeKg(){return capacidadeKg;} public int getVelocidadeMaxima(){return velocidadeMaxima;}
    @Override public String toString(){return "Veiculo{placa='"+placa+"', capacidade="+capacidadeKg+", velocidade="+velocidadeMaxima+"}";}
}
