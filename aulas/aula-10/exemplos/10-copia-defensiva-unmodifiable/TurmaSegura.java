import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TurmaSegura {
    private final List<String> alunos = new ArrayList<>();
    public void adicionar(String nome){ alunos.add(nome); }
    public List<String> getAlunos(){ return Collections.unmodifiableList(alunos); }
    public static void main(String[] args){ TurmaSegura t=new TurmaSegura(); t.adicionar("Ana"); System.out.println(t.getAlunos()); }
}
