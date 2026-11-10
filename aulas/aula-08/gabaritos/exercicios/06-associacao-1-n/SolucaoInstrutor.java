import java.util.ArrayList;
import java.util.List;

public class SolucaoInstrutor {
    private String nome;
    private List<Aluno> alunos = new ArrayList<>();

    public SolucaoInstrutor(String nome) {
        this.nome = nome;
    }

    public void adicionarAluno(Aluno aluno) {
        alunos.add(aluno);
    }

    public int quantidadeAlunos() {
        return alunos.size();
    }

    static class Aluno {
        private String nome;

        Aluno(String nome) {
            this.nome = nome;
        }
    }

    public static void main(String[] args) {
        SolucaoInstrutor instrutor = new SolucaoInstrutor("Marina");
        instrutor.adicionarAluno(new Aluno("Ana"));
        instrutor.adicionarAluno(new Aluno("Bruno"));
        System.out.println(instrutor.quantidadeAlunos());
    }
}
