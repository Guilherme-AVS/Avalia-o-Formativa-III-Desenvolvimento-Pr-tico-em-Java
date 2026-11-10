public class Solucao04 {
    public static void main(String[] args) {
        double[] notas = {8.0, 7.5, 9.0, 6.5};
        double soma = 0;

        for (double nota : notas) {
            soma += nota;
        }

        System.out.println("Média: " + soma / notas.length);
    }
}
