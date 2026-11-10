public class SolucaoMatrizNotas {
    public static void main(String[] args) {
        double[][] notas = {
            {8.0, 7.0, 9.0},
            {6.0, 7.5, 8.0}
        };

        double maior = notas[0][0];
        double menor = notas[0][0];
        double soma = 0;
        int quantidade = 0;

        for (double[] linha : notas) {
            for (double nota : linha) {
                soma += nota;
                quantidade++;
                if (nota > maior) maior = nota;
                if (nota < menor) menor = nota;
            }
        }

        System.out.println("Maior: " + maior);
        System.out.println("Menor: " + menor);
        System.out.println("Média geral: " + soma / quantidade);
    }
}
