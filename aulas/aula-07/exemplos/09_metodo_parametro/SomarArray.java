public class SomarArray {
    public static int somar(int[] numeros) {
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        return soma;
    }

    public static void main(String[] args) {
        int[] valores = {10, 20, 30};
        System.out.println(somar(valores));
    }
}
