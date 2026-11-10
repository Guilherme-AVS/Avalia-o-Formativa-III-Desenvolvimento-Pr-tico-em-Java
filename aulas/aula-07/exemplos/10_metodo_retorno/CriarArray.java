public class CriarArray {
    public static int[] criarNumeros() {
        return new int[]{10, 20, 30};
    }

    public static void main(String[] args) {
        int[] numeros = criarNumeros();
        System.out.println(numeros[0]);
    }
}
