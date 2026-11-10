public class Vendedor extends Funcionario {private double comissao;public Vendedor(String n,double s,double c){super(n,s);comissao=c;}public double calcularSalario(){return salarioBase+comissao;}}
