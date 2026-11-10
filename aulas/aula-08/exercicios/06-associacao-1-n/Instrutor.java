import java.util.ArrayList;
import java.util.List;

public class Instrutor {
    private String nome;
    private List<Aluno> alunos = new ArrayList<>();

    public Instrutor(String nome) {
        this.nome = nome;
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public static class Aluno {
        private String nome;

        public Aluno(String nome) {
            this.nome = nome;
        }
    }

    public static void main(String[] args) {
        Instrutor instrutor = new Instrutor("Preencha");
        instrutor.adicionarAluno(new Aluno("Ana"));
        instrutor.adicionarAluno(new Aluno("Bruno"));
        System.out.println("Alunos associados: " + instrutor.alunos.size());
    }
}
