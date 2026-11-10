public class Solucao05 {
    public static void main(String[] args) {
        int[] numeros = {17, 4, 29, 12, 8};
        int maior = numeros[0];
        int menor = numeros[0];

        for (int numero : numeros) {
            if (numero > maior) maior = numero;
            if (numero < menor) menor = numero;
        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
    }
}
