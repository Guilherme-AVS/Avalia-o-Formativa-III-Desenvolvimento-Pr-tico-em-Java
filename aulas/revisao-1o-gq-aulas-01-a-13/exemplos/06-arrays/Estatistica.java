public class Estatistica {
    public static int soma(int[] valores) {
        int total = 0;
        for (int valor : valores) total += valor;
        return total;
    }

    public static double media(int[] valores) {
        return (double) soma(valores) / valores.length;
    }
}
