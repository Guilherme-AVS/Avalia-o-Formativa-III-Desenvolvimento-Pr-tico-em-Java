public class Conta {
    private double saldo;
    public double getSaldo(){return saldo;}
    public void depositar(double valor){if(valor>0)saldo+=valor;}
    public boolean sacar(double valor){if(valor>0&&valor<=saldo){saldo-=valor;return true;}return false;}
    public static void main(String[] args){Conta c=new Conta();c.depositar(500);System.out.println(c.sacar(600));System.out.println(c.getSaldo());}
}
