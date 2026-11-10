import java.util.ArrayList;

public class SolucaoEstrutura {
    public static void main(String[] args) {
        int[] dadosFixos = {10, 20, 30};

        ArrayList<Integer> dadosDinamicos = new ArrayList<>();
        dadosDinamicos.add(10);
        dadosDinamicos.add(20);
        dadosDinamicos.add(30);
        dadosDinamicos.add(40);

        System.out.println("Array: " + dadosFixos.length);
        System.out.println("ArrayList: " + dadosDinamicos.size());
    }
}
