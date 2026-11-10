import java.util.ArrayList;

public class WrapperClasses {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<Double> notas = new ArrayList<>();

        numeros.add(10);
        numeros.add(20);
        notas.add(8.5);

        int n = numeros.get(0);
        double nota = notas.get(0);

        System.out.println(n);
        System.out.println(nota);
    }
}
