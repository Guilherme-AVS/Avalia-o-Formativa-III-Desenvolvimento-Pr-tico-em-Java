public class Pessoa {
    private String nome;
    private String cpf;
    private Endereco endereco;

    public Pessoa(String nome, String cpf, Endereco endereco) {
        if (nome == null || nome.isBlank()) {
            throw new IllegalArgumentException("Nome obrigatório");
        }
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }

    public Pessoa(String nome, String cpf) {
        this(nome, cpf, null);
    }

    public String getNome() { return nome; }
    public String getCpf() { return cpf; }
    public Endereco getEndereco() { return endereco; }
}
