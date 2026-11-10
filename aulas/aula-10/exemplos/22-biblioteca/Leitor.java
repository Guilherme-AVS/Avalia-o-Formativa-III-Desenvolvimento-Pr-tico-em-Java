public class Leitor {
    private String nome,cpf,email;
    public Leitor(String nome,String cpf,String email){setNome(nome);setCpf(cpf);setEmail(email);}
    public String getNome(){return nome;} public void setNome(String n){if(n!=null&&!n.isBlank())nome=n.trim();}
    public String getCpf(){return cpf;} public void setCpf(String c){if(c!=null&&c.matches("\\d{11}"))cpf=c;}
    public String getEmail(){return email;} public void setEmail(String e){if(e!=null&&e.contains("@"))email=e.trim();}
    public String toString(){return nome+" (CPF: "+cpf+")";}
    public static void main(String[] args){System.out.println(new Leitor("Ana","12345678901","ana@unicap.br"));}
}
