import java.util.Arrays;

public class BoletimArray {
    public static double media(double[] notas) {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public static double maior(double[] notas) {
        double maior = notas[0];
        for (double nota : notas) {
            if (nota > maior) {
                maior = nota;
            }
        }
        return maior;
    }

    public static double menor(double[] notas) {
        double menor = notas[0];
        for (double nota : notas) {
            if (nota < menor) {
                menor = nota;
            }
        }
        return menor;
    }

    public static void main(String[] args) {
        double[] notas = {8.0, 7.5, 9.0, 6.5};

        System.out.println(Arrays.toString(notas));
        System.out.println("Média: " + media(notas));
        System.out.println("Maior: " + maior(notas));
        System.out.println("Menor: " + menor(notas));
    }
}
