public class ContaBancariaPublica {
    public String titular;
    public double saldo;
    public boolean ativa;

    public static void main(String[] args) {
        ContaBancariaPublica c = new ContaBancariaPublica();
        c.titular = "";
        c.saldo = -500;
        c.ativa = false;
        System.out.println(c.saldo);
    }
}
