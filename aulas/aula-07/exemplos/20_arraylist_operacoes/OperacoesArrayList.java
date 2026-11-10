import java.util.ArrayList;

public class OperacoesArrayList {
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();

        nomes.add("Ana");
        nomes.add("Bruno");
        nomes.add(1, "Beatriz");
        nomes.set(1, "Carla");

        System.out.println(nomes.get(0));
        System.out.println(nomes.contains("Ana"));

        nomes.remove(1);
        nomes.remove("Bruno");

        System.out.println(nomes);
        System.out.println(nomes.isEmpty());
    }
}
