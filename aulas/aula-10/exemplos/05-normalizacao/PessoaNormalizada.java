public class PessoaNormalizada {
    private String nome;
    private String email;

    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) this.nome = nome.trim();
    }
    public void setEmail(String email) {
        if (email != null && email.contains("@")) this.email = email.trim().toLowerCase();
    }
    public String getNome() { return nome; }
    public String getEmail() { return email; }

    public static void main(String[] args) {
        PessoaNormalizada p = new PessoaNormalizada();
        p.setNome("  Ana Lima  "); p.setEmail("ANA@UNICAP.BR");
        System.out.println(p.getNome()+" / "+p.getEmail());
    }
}
