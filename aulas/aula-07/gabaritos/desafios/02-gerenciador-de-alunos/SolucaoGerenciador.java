import java.util.ArrayList;

public class SolucaoGerenciador {
    public static void main(String[] args) {
        ArrayList<String> alunos = new ArrayList<>();

        alunos.add("Ana");
        alunos.add("Bruno");
        alunos.add("Carlos");

        System.out.println("Lista: " + alunos);
        System.out.println("Busca Ana: " + alunos.contains("Ana"));

        alunos.remove("Bruno");
        System.out.println("Depois da remoção: " + alunos);
    }
}
