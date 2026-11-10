import java.util.Scanner;

public class MediaMaiorMenor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;
        int contador = 0;
        int maior = Integer.MIN_VALUE;
        int menor = Integer.MAX_VALUE;

        System.out.println("Digite números inteiros. Digite 0 para encerrar.");

        int numero;
        do {
            System.out.print("Número: ");
            numero = scanner.nextInt();

            if (numero != 0) {
                soma += numero;
                contador++;

                if (numero > maior) {
                    maior = numero;
                }

                if (numero < menor) {
                    menor = numero;
                }
            }
        } while (numero != 0);

        if (contador == 0) {
            System.out.println("Nenhum número foi informado.");
        } else {
            double media = (double) soma / contador;
            System.out.println("Soma: " + soma);
            System.out.println("Média: " + media);
            System.out.println("Maior: " + maior);
            System.out.println("Menor: " + menor);
        }

        scanner.close();
    }
}
