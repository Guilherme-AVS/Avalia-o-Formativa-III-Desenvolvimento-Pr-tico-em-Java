import java.util.ArrayList;

public class GerenciadorDeAlunosDesafio {
    public static void main(String[] args) {
        ArrayList<String> alunos = new ArrayList<>();

        alunos.add("Ana");
        alunos.add("Bruno");
        alunos.add("Carlos");

        System.out.println("Alunos: " + alunos);
        System.out.println("Existe Bruno? " + alunos.contains("Bruno"));

        alunos.remove("Bruno");
        System.out.println("Após remoção: " + alunos);
    }
}
