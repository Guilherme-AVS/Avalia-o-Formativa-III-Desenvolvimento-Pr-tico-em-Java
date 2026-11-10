import java.util.ArrayList;

public class Solucao09 {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<>();

        numeros.add(10);
        numeros.add(20);
        numeros.add(30);

        for (int numero : numeros) {
            System.out.println(numero);
        }

        numeros.remove(Integer.valueOf(20));
        System.out.println(numeros);
    }
}
