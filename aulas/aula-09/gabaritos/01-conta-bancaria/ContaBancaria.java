public class ContaBancaria {
    private String titular;
    private String numeroConta;
    private double saldo;

    public ContaBancaria(String titular, String numeroConta, double saldo) {
        if (titular == null || titular.isBlank()) {
            throw new IllegalArgumentException("Titular obrigatório");
        }
        if (saldo < 0) {
            throw new IllegalArgumentException("Saldo não pode ser negativo");
        }
        this.titular = titular;
        this.numeroConta = numeroConta;
        this.saldo = saldo;
    }

    public ContaBancaria(String titular, String numeroConta) {
        this(titular, numeroConta, 0.0);
    }

    public ContaBancaria() {
        this("Anônimo", "000", 0.0);
    }

    public String toString() {
        return titular + " | " + numeroConta + " | R$" + saldo;
    }

    public static void main(String[] args) {
        System.out.println(new ContaBancaria());
        System.out.println(new ContaBancaria("Ana", "123"));
        System.out.println(new ContaBancaria("João", "456", 100));
    }
}
