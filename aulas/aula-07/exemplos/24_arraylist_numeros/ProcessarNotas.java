import java.util.ArrayList;

public class ProcessarNotas {
    public static double calcularMedia(ArrayList<Double> notas) {
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

        System.out.println("Média: " + calcularMedia(notas));
    }
}
