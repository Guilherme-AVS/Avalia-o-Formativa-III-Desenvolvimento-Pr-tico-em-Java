import java.util.ArrayList;

public class ComparacaoEstruturas {
    public static void main(String[] args) {
        int[] array = {10, 20, 30};

        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(10);
        lista.add(20);
        lista.add(30);
        lista.add(40);

        System.out.println("Array: " + array.length + " elementos");
        System.out.println("ArrayList: " + lista.size() + " elementos");
    }
}
