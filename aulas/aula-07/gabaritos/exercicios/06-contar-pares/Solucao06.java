public class Solucao06 {
    public static void main(String[] args) {
        int[] numeros = {2, 7, 10, 13, 18, 21};
        int pares = 0;

        for (int numero : numeros) {
            if (numero % 2 == 0) pares++;
        }

        System.out.println("Pares: " + pares);
    }
}
