public class Aluno {
    private final String matricula;
    private String nome;
    public Aluno(String matricula,String nome){ this.matricula=matricula; setNome(nome); }
    public String getMatricula(){return matricula;}
    public String getNome(){return nome;}
    public void setNome(String nome){if(nome!=null&&!nome.isBlank())this.nome=nome.trim();}
    public static void main(String[] args){Aluno a=new Aluno("20260001","Ana");System.out.println(a.getMatricula()+" "+a.getNome());}
}
