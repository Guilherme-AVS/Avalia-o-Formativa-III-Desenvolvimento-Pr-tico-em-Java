public class Carteira {
    private double saldo;

    public Carteira(double saldoInicial) {
        if (saldoInicial >= 0) saldo = saldoInicial;
    }

    public boolean depositar(double valor) {
        if (valor <= 0) return false;
        saldo += valor;
        return true;
    }

    public boolean sacar(double valor) {
        if (valor <= 0 || valor > saldo) return false;
        saldo -= valor;
        return true;
    }

    public double getSaldo() { return saldo; }
}
