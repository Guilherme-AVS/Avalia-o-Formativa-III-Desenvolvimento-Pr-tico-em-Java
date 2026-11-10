public class Funcionario extends Pessoa {
    private String cargo;
    private double salario;

    public Funcionario(String nome, String cpf, Endereco endereco, String cargo, double salario) {
        super(nome, cpf, endereco);
        if (salario < 0) {
            throw new IllegalArgumentException("Salário não pode ser negativo");
        }
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getCargo() { return cargo; }
    public double getSalario() { return salario; }
}
