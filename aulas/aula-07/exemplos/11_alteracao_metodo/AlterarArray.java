public class AlterarArray {
    public static void dobrar(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] *= 2;
        }
    }

    public static void main(String[] args) {
        int[] numeros = {1, 2, 3};
        dobrar(numeros);

        for (int numero : numeros) {
            System.out.println(numero);
        }
    }
}
