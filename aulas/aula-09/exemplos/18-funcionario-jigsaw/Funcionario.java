public class Funcionario {
    private String nome;
    private String cargo;
    private double salario;
    private boolean ativo;

    public Funcionario(String nome, String cargo, double salario, boolean ativo) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome obrigatório");
        }
        if (salario < 0) {
            throw new IllegalArgumentException("Salário não pode ser negativo");
        }
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
        this.ativo = ativo;
    }

    public Funcionario(String nome, String cargo) {
        this(nome, cargo, 0.0, true);
    }

    public Funcionario(String nome) {
        this(nome, "Não definido");
    }

    public String toString() {
        return nome + " | " + cargo + " | R$" + salario + " | ativo=" + ativo;
    }

    public static void main(String[] args) {
        System.out.println(new Funcionario("Ana"));
        try {
            new Funcionario(null, "Dev", -1, true);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
