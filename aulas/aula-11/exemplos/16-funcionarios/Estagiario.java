public class Estagiario extends Funcionario {
    private final double bolsa;
    public Estagiario(String nome,String cpf,double bolsa){super(nome,cpf,0);this.bolsa=bolsa;}
    @Override public double calcularSalario(){return bolsa;}
    @Override public String toString(){return "Estagiario{"+getNome()+", bolsa="+String.format("%.2f",bolsa)+"}";}
}
