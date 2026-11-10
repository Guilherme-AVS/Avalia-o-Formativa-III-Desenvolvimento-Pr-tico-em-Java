import java.util.ArrayList;

public class BoletimDaTurma {
    public static double media(double[] notas) {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        return soma / notas.length;
    }

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
        double[] notasArray = {8.0, 7.5, 9.0};
        ArrayList<Double> notasLista = new ArrayList<>();
        notasLista.add(8.0);
        notasLista.add(7.5);
        notasLista.add(9.0);

        System.out.println("Média com array: " + media(notasArray));
        System.out.println("Média com ArrayList: " + media(notasLista));
    }
}
