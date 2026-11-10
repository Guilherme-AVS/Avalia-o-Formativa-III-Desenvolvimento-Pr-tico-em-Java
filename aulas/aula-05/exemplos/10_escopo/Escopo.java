public class Escopo {
    public static void exemploA() {
        int valor = 10;
        System.out.println("A: " + valor);
    }

    public static void exemploB() {
        int valor = 99;
        System.out.println("B: " + valor);
    }

    public static void main(String[] args) {
        exemploA();
        exemploB();
    }
}
