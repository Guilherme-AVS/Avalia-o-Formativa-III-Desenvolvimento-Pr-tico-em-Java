public class AcimaDaMedia {
    public static void main(String[] args) {
        double[] notas = {5.0, 8.0, 9.0, 6.0, 7.0};
        double soma = 0;

        for (double nota : notas) {
            soma += nota;
        }

        double media = soma / notas.length;
        int acima = 0;

        for (double nota : notas) {
            if (nota > media) {
                acima++;
            }
        }

        System.out.println("Média: " + media);
        System.out.println("Acima da média: " + acima);
    }
}
