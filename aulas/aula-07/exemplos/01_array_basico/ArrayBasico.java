public class ArrayBasico {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};

        System.out.println(numeros[0]);
        System.out.println(numeros[4]);
        System.out.println("Tamanho: " + numeros.length);

        numeros[0] = 100;
        System.out.println("Primeiro após alteração: " + numeros[0]);
    }
}
