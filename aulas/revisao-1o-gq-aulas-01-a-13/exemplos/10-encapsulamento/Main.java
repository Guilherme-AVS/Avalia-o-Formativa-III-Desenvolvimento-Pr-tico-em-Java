public class Main {
    public static void main(String[] args) {
        Carteira c = new Carteira(100);
        System.out.println(c.sacar(120));
        c.depositar(50);
        System.out.println(c.getSaldo());
    }
}
