public class ParametroArgumento {
    public static int somar(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        int x = 3;
        int y = 7;

        int resultado = somar(x, y);
        int outro = somar(10, 20);

        System.out.println(resultado);
        System.out.println(outro);
    }
}
