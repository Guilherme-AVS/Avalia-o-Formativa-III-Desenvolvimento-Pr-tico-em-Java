import java.util.ArrayList;

public class EscolhaDaEstrutura {
    public static void main(String[] args) {
        int[] capacidadeConhecida = {10, 20, 30};

        ArrayList<Integer> quantidadeVariavel = new ArrayList<>();
        quantidadeVariavel.add(10);
        quantidadeVariavel.add(20);
        quantidadeVariavel.add(30);
        quantidadeVariavel.add(40);

        System.out.println("Array: " + capacidadeConhecida.length);
        System.out.println("ArrayList: " + quantidadeVariavel.size());
    }
}
