public class Empresa {
    private String nome;
    private String cnpj;
    private Funcionario[] funcionarios;
    private int total;

    public Empresa(String nome, String cnpj, int capacidade) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome obrigatório");
        }
        if (capacidade <= 0) {
            throw new IllegalArgumentException("Capacidade deve ser positiva");
        }
        this.nome = nome;
        this.cnpj = cnpj;
        this.funcionarios = new Funcionario[capacidade];
        this.total = 0;
    }

    public void adicionarFuncionario(Funcionario funcionario) {
        if (funcionario == null) {
            throw new IllegalArgumentException("Funcionário obrigatório");
        }
        if (total >= funcionarios.length) {
            throw new IllegalStateException("Capacidade esgotada");
        }
        funcionarios[total++] = funcionario;
    }

    public int getTotal() {
        return total;
    }

    public static void main(String[] args) {
        Empresa empresa = new Empresa("Tech Recife", "12345678000100", 2);
        Endereco endereco = new Endereco("Rua A", "Recife", "50000-000");
        empresa.adicionarFuncionario(new Funcionario("Ana", "123", endereco, "Dev", 5000));
        System.out.println("Funcionários: " + empresa.getTotal());
    }
}
