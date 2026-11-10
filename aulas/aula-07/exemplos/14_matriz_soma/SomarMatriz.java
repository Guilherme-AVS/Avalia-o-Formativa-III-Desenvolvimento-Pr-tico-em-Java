public class SomarMatriz {
    public static int somar(int[][] matriz) {
        int soma = 0;

        for (int[] linha : matriz) {
            for (int valor : linha) {
                soma += valor;
            }
        }

        return soma;
    }

    public static void main(String[] args) {
        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println("Soma: " + somar(matriz));
    }
}
