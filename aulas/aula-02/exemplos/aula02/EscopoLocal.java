public class EscopoLocal {
    public static void main(String[] args) {
        int x = 10;

        if (x > 5) {
            int y = 20;
            System.out.println("Dentro do if: x = " + x + ", y = " + y);
        }

        System.out.println("Fora do if: x = " + x);

        mostrarEscopo();
    }

    static void mostrarEscopo() {
        int valor = 42;
        System.out.println("valor existe dentro do metodo: " + valor);
    }
}
