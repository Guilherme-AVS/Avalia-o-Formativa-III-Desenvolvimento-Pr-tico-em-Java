public class Cliente {
    private final String cpf; private String nome,email,telefone,habilitacao;
    public Cliente(String cpf,String nome,String email,String telefone,String habilitacao){if(cpf==null||cpf.isBlank())throw new IllegalArgumentException("CPF");this.cpf=cpf;setNome(nome);setEmail(email);setTelefone(telefone);setHabilitacao(habilitacao);}
    public String getCpf(){return cpf;} public String getNome(){return nome;} public void setNome(String n){if(n!=null&&!n.isBlank())nome=n.trim();}
    public String getEmail(){return email;} public void setEmail(String e){if(e!=null&&e.contains("@"))email=e.trim().toLowerCase();}
    public String getTelefone(){return telefone;} public void setTelefone(String t){if(t!=null&&!t.isBlank())telefone=t.trim();}
    public String getHabilitacao(){return habilitacao;} public void setHabilitacao(String h){if(h!=null&&!h.isBlank())habilitacao=h.trim();}
    public static void main(String[] args){Cliente c=new Cliente("123","Ana","ANA@UNICAP.BR","81999999999","AB");System.out.println(c.getEmail());}
}
