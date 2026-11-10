public class ContarPares {
    public static void main(String[] args) {
        int[] numeros = {2, 7, 10, 13, 18, 21};
        int quantidade = 0;

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                quantidade++;
            }
        }

        System.out.println("Pares: " + quantidade);
    }
}
