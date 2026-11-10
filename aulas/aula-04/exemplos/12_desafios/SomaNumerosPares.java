public class SomaNumerosPares {
    public static void main(String[] args) {
        int soma = 0;

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println("Par: " + i);
                soma += i;
            }
        }

        System.out.println("Soma total: " + soma);
    }
}
