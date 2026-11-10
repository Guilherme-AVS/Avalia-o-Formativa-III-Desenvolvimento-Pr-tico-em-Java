import java.util.ArrayList;

public class BoletimArrayList {
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

        notas.remove(1);
        notas.add(6.5);

        System.out.println("Notas: " + notas);
        System.out.println("Média: " + media(notas));
    }
}
