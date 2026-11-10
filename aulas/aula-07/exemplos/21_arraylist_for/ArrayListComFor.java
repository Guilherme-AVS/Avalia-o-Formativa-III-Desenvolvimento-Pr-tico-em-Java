import java.util.ArrayList;

public class ArrayListComFor {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Ana");
        nomes.add("Bruno");
        nomes.add("Carlos");

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(i + ": " + nomes.get(i));
        }
    }
}
