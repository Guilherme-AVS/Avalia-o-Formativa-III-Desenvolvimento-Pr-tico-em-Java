public class Funcionario {
    private final String nome; private final String cpf; private final double salarioBase;
    public Funcionario(String nome,String cpf,double salarioBase){this.nome=nome;this.cpf=cpf;this.salarioBase=salarioBase;}
    public String getNome(){return nome;} public String getCpf(){return cpf;} public double getSalarioBase(){return salarioBase;}
    public double calcularSalario(){return salarioBase;}
    @Override public String toString(){return "Funcionario{nome='"+nome+"', cpf='"+cpf+"', salario="+String.format("%.2f",calcularSalario())+"}";}
}
