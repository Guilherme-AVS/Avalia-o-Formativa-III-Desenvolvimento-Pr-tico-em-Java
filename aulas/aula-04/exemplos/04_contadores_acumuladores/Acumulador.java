public class Acumulador {
    public static void main(String[] args) {
        int soma = 0;

        for (int i = 1; i <= 5; i++) {
            soma += i;
        }

        System.out.println("Soma total: " + soma);
    }
}
