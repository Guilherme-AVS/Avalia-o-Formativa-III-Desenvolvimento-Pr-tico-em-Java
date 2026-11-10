public class Gerente extends Funcionario {
    private final double bonus;
    public Gerente(String nome,String cpf,double salarioBase,double bonus){super(nome,cpf,salarioBase);this.bonus=bonus;}
    @Override public double calcularSalario(){return getSalarioBase()+bonus;}
    @Override public String toString(){return "Gerente{"+super.toString()+", bonus="+String.format("%.2f",bonus)+"}";}
}
