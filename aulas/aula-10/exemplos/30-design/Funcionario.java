public class Funcionario {
    private final String nome; private double salario;
    public Funcionario(String nome,double salario){if(nome==null||nome.isBlank())throw new IllegalArgumentException("Nome");if(salario<0)throw new IllegalArgumentException("Salário");this.nome=nome.trim();this.salario=salario;}
    public String getNome(){return nome;} public double getSalario(){return salario;}
    public void reajustar(double percentual){if(percentual>=0)salario*=1+percentual/100;}
    public double calcularImposto(){return salario*0.15;}
    public static void main(String[] args){Funcionario f=new Funcionario("Ana",3000);f.reajustar(10);System.out.println(f.getSalario());}
}
