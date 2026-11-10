public class Vendedor extends Funcionario {
    private final double comissao;
    public Vendedor(String nome,String cpf,double salarioBase,double comissao){super(nome,cpf,salarioBase);this.comissao=comissao;}
    @Override public double calcularSalario(){return getSalarioBase()+comissao;}
    @Override public String toString(){return "Vendedor{"+super.toString()+", comissao="+String.format("%.2f",comissao)+"}";}
}
