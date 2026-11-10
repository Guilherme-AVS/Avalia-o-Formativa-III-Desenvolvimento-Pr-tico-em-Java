public class RelatorioNumerico {
    public static int maior(int a, int b) {
        return Math.max(a, b);
    }

    public static int menor(int a, int b) {
        return Math.min(a, b);
    }

    public static double media(int a, int b) {
        return (a + b) / 2.0;
    }

    public static boolean ePar(int n) {
        return n % 2 == 0;
    }

    public static void exibirRelatorio(int a, int b) {
        System.out.println("Maior: " + maior(a, b));
        System.out.println("Menor: " + menor(a, b));
        System.out.println("Média: " + media(a, b));
        System.out.println(a + " é par? " + ePar(a));
        System.out.println(b + " é par? " + ePar(b));
    }

    public static void main(String[] args) {
        exibirRelatorio(8, 13);
    }
}
