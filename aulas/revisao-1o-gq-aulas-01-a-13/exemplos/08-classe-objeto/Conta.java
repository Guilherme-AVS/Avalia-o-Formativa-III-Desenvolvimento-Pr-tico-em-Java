public class Conta {
    String titular;
    double saldo;

    public void depositar(double valor) { saldo += valor; }
    public double consultarSaldo() { return saldo; }
}
