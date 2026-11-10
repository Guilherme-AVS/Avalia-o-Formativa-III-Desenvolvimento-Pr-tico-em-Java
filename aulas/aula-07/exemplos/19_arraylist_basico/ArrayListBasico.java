import java.util.ArrayList;

public class ArrayListBasico {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Ana");
        nomes.add("Bruno");
        nomes.add("Carlos");

        System.out.println(nomes);
        System.out.println("Tamanho: " + nomes.size());
    }
}
