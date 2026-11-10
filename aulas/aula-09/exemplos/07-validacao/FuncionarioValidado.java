public class FuncionarioValidado {
    private String nome;
    private double salario;

    public FuncionarioValidado(String nome, double salario) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome obrigatório");
        }
        if (salario < 0) {
            throw new IllegalArgumentException("Salário não pode ser negativo");
        }
        this.nome = nome;
        this.salario = salario;
    }

    public String toString() {
        return nome + " | R$ " + salario;
    }

    public static void main(String[] args) {
        System.out.println(new FuncionarioValidado("Ana", 4500));
        try {
            new FuncionarioValidado(null, -5000);
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
