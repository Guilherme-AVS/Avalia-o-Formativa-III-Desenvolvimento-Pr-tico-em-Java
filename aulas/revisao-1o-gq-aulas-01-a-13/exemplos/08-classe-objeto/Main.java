public class Main {
    public static void main(String[] args) {
        Conta c1 = new Conta();
        Conta c2 = new Conta();
        c1.titular = "Ana";
        c2.titular = "Bruno";
        c1.depositar(100);
        c2.depositar(250);
        System.out.println(c1.consultarSaldo());
        System.out.println(c2.consultarSaldo());
    }
}
