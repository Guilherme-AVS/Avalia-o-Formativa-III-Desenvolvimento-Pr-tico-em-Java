import java.util.ArrayList;
import java.util.List;

public class Turma {
    private final List<String> alunos = new ArrayList<>();
    public void adicionarAluno(String nome){ if(nome!=null&&!nome.isBlank()) alunos.add(nome.trim()); }
    public List<String> getAlunos(){ return new ArrayList<>(alunos); }
    public static void main(String[] args){ Turma t=new Turma(); t.adicionarAluno("Ana"); List<String> copia=t.getAlunos(); copia.clear(); System.out.println(t.getAlunos().size()); }
}
