public class DocumentoPessoa {
    private String cpf;
    private String telefone;

    public void setCpf(String cpf) {
        if (cpf == null) return;
        String d = cpf.replaceAll("[^\\d]", "");
        if (d.length() == 11) this.cpf = d;
    }
    public void setTelefone(String telefone) {
        if (telefone == null) return;
        String d = telefone.replaceAll("[^\\d]", "");
        if (d.length() >= 8 && d.length() <= 11) this.telefone = d;
    }
    public String getCpf() { return cpf; }
    public String getTelefone() { return telefone; }
    public static void main(String[] args) {
        DocumentoPessoa p = new DocumentoPessoa(); p.setCpf("123.456.789-01"); p.setTelefone("(81) 99999-9999");
        System.out.println(p.getCpf()+" / "+p.getTelefone());
    }
}
