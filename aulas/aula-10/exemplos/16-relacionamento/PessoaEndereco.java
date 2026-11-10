public class PessoaEndereco {
    private String nome; private Endereco endereco;
    public PessoaEndereco(String nome,Endereco endereco){this.nome=nome;this.endereco=endereco;}
    public String getNome(){return nome;} public Endereco getEndereco(){return endereco;}
    public static void main(String[] args){PessoaEndereco p=new PessoaEndereco("Ana",new Endereco("Rua A","Recife"));System.out.println(p.getEndereco().getCidade());}
}
