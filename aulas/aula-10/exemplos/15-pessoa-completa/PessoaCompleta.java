public class PessoaCompleta {
    private String nome; private int idade; private String email;
    public PessoaCompleta(String nome,int idade,String email){setNome(nome);setIdade(idade);setEmail(email);}
    public String getNome(){return nome;} public int getIdade(){return idade;} public String getEmail(){return email;}
    public void setNome(String nome){if(nome!=null&&!nome.isBlank())this.nome=nome.trim();}
    public void setIdade(int idade){if(idade>=0&&idade<=120)this.idade=idade;}
    public void setEmail(String email){if(email!=null&&email.contains("@"))this.email=email.trim().toLowerCase();}
    public String toString(){return nome+" / "+idade+" / "+email;}
    public static void main(String[] args){System.out.println(new PessoaCompleta(" Ana ",22,"ANA@UNICAP.BR"));}
}
