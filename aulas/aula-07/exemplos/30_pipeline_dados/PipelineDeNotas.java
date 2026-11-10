import java.util.ArrayList;

public class PipelineDeNotas {
    public static double media(ArrayList<Double> notas) {
        if (notas.isEmpty()) {
            return 0;
        }

        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.size();
    }

    public static void main(String[] args) {
        ArrayList<Double> notas = new ArrayList<>();

        notas.add(8.0);
        notas.add(7.5);
        notas.add(9.0);

        double media = media(notas);

        if (media >= 7) {
            System.out.println("Turma acima do critério.");
        } else {
            System.out.println("Turma precisa de acompanhamento.");
        }

        System.out.println("Média: " + media);
    }
}
