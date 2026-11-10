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

    public void listarAlunos() {
        System.out.println("Instrutor: " + nome);
        for (Aluno aluno : alunos) {
            System.out.println("- " + aluno.getNome());
        }
    }

    public static class Aluno {
        private String nome;

        public Aluno(String nome) {
            this.nome = nome;
        }

        public String getNome() {
            return nome;
        }
    }

    public static void main(String[] args) {
        Instrutor instrutor = new Instrutor("Marina");
        instrutor.adicionarAluno(new Aluno("Ana"));
        instrutor.adicionarAluno(new Aluno("Bruno"));
        instrutor.adicionarAluno(new Aluno("Carlos"));
        instrutor.listarAlunos();
    }
}
