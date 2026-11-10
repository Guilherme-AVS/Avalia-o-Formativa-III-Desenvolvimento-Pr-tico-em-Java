public class MatrizNotas {
    public static double mediaAluno(double[] notas) {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

    public static void main(String[] args) {
        double[][] notas = {
            {8.0, 7.0, 9.0},
            {6.0, 7.5, 8.0}
        };

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Média do aluno " + i + ": " + mediaAluno(notas[i]));
        }
    }
}
