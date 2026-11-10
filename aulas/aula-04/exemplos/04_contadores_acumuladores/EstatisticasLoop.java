public class EstatisticasLoop {
    public static void main(String[] args) {
        int soma = 0;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;
        int contador = 0;

        for (int i = 1; i <= 5; i++) {
            int numero = i * 3;

            soma += numero;
            contador++;

            if (numero > maior) {
                maior = numero;
            }

            if (numero < menor) {
                menor = numero;
            }
        }

        double media = (double) soma / contador;

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
    }
}
