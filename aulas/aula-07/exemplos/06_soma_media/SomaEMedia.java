public class SomaEMedia {
    public static void main(String[] args) {
        double[] notas = {8.0, 7.5, 9.0, 6.5, 8.5};
        double soma = 0;

        for (double nota : notas) {
            soma += nota;
        }

        double media = soma / notas.length;
        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
    }
}
