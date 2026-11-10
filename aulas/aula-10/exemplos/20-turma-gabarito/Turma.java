import java.util.*;
public class Turma {
    private String codigo; private Disciplina disciplina; private List<String> alunos=new ArrayList<>(); private int capacidadeMaxima;
    public Turma(String codigo,Disciplina disciplina,int capacidade){this.codigo=codigo;this.disciplina=disciplina;setCapacidadeMaxima(capacidade);}
    public String getCodigo(){return codigo;} public Disciplina getDisciplina(){return disciplina;}
    public List<String> getAlunos(){return new ArrayList<>(alunos);}
    public int getCapacidadeMaxima(){return capacidadeMaxima;} public void setCapacidadeMaxima(int c){if(c>0)capacidadeMaxima=c;}
    public void adicionarAluno(String aluno){if(aluno!=null&&alunos.size()<capacidadeMaxima)alunos.add(aluno);}
    public String toString(){return "Turma "+codigo+" | "+disciplina+" | Alunos: "+alunos.size()+"/"+capacidadeMaxima;}
    public static void main(String[] args){Turma t=new Turma("T01",new Disciplina("POO001","POO",60),2);t.adicionarAluno("Ana");System.out.println(t);}
}
class Disciplina {private String nome,codigo;private int carga;Disciplina(String c,String n,int h){codigo=c;nome=n;carga=h;}public String toString(){return codigo+" - "+nome+" ("+carga+"h)";}}
