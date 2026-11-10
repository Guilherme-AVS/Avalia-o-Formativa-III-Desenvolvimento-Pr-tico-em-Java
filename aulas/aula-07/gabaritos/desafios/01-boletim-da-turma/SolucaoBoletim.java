import java.util.ArrayList;

public class SolucaoBoletim {
    public static double soma(double[] notas) {
        double total = 0;
        for (double nota : notas) total += nota;
        return total;
    }

    public static double media(ArrayList<Double> notas) {
        if (notas.isEmpty()) return 0;
        double total = 0;
        for (double nota : notas) total += nota;
        return total / notas.size();
    }

    public static void main(String[] args) {
        double[] array = {8.0, 7.5, 9.0, 6.5};
        ArrayList<Double> lista = new ArrayList<>();
        lista.add(8.0);
        lista.add(7.5);
        lista.add(9.0);
        lista.add(6.5);

        System.out.println("Soma array: " + soma(array));
        System.out.println("Média ArrayList: " + media(lista));
    }
}
