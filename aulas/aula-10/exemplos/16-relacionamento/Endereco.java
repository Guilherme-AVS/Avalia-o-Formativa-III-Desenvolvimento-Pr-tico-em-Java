public class Endereco {
    private String rua; private String cidade;
    public Endereco(String rua,String cidade){setRua(rua);setCidade(cidade);}
    public String getRua(){return rua;} public String getCidade(){return cidade;}
    public void setRua(String rua){if(rua!=null&&!rua.isBlank())this.rua=rua.trim();}
    public void setCidade(String cidade){if(cidade!=null&&!cidade.isBlank())this.cidade=cidade.trim();}
}
