public class Solucao03 {
    public static void main(String[] args) {
        int[] numeros = {5, 10, 15};
        int soma = 0;

        for (int numero : numeros) {
            soma += numero;
        }

        System.out.println("Soma: " + soma);
    }
}
