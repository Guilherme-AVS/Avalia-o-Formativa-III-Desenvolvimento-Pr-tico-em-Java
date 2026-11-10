public class Gerente extends Funcionario {private double bonus;public Gerente(String n,double s,double b){super(n,s);bonus=b;}public double calcularSalario(){return salarioBase+bonus;}}
