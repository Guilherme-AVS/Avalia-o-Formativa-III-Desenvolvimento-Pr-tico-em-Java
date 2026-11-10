public class Aluno {
    private String nome; private String matricula; private double nota;
    public Aluno(String nome,String matricula,double nota){setNome(nome);setMatricula(matricula);setNota(nota);}
    public String getNome(){return nome;} public void setNome(String nome){if(nome!=null&&!nome.isBlank())this.nome=nome.trim();}
    public String getMatricula(){return matricula;} public void setMatricula(String m){if(m!=null&&m.matches("\\d{8}"))this.matricula=m;}
    public double getNota(){return nota;} public void setNota(double n){if(n>=0&&n<=10)this.nota=n;}
    public String toString(){return "Aluno{nome='"+nome+"', matricula='"+matricula+"', nota="+nota+"}";}
    public static void main(String[] args){System.out.println(new Aluno("Ana Lima","20260001",8.5));}
}
