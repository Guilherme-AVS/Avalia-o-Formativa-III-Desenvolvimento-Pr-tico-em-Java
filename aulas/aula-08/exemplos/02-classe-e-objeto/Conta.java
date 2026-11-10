public class Conta {
    private String titular;
    private double saldo;

    public void depositar(double valor) {
        saldo += valor;
    }

    public void exibirResumo() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public static void main(String[] args) {
        Conta contaJoao = new Conta();
        contaJoao.setTitular("João");
        contaJoao.depositar(500);

        Conta contaMaria = new Conta();
        contaMaria.setTitular("Maria");
        contaMaria.depositar(750);

        contaJoao.exibirResumo();
        contaMaria.exibirResumo();
    }
}
