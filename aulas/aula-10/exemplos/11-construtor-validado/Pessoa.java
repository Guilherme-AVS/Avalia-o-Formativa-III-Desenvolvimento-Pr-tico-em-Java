public class Pessoa {
    private String nome;
    private int idade;
    public Pessoa(String nome,int idade){ setNome(nome); setIdade(idade); }
    public void setNome(String nome){ if(nome!=null&&!nome.isBlank()) this.nome=nome.trim(); else System.out.println("Nome inválido"); }
    public void setIdade(int idade){ if(idade>=0&&idade<=120)this.idade=idade; else System.out.println("Idade inválida"); }
    public String getNome(){return nome;} public int getIdade(){return idade;}
    public static void main(String[] args){Pessoa p=new Pessoa(" Ana ",-5);System.out.println(p.getNome()+" "+p.getIdade());}
}
