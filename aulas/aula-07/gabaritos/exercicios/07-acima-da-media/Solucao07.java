public class Solucao07 {
    public static void main(String[] args) {
        double[] numeros = {4, 6, 7, 8, 10, 5, 9, 3, 7, 6};
        double soma = 0;

        for (double numero : numeros) soma += numero;

        double media = soma / numeros.length;
        int acima = 0;

        for (double numero : numeros) {
            if (numero > media) acima++;
        }

        System.out.println("Média: " + media);
        System.out.println("Acima: " + acima);
    }
}
