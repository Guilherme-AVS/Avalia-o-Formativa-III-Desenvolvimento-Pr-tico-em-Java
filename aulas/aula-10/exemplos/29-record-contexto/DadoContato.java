public record DadoContato(String nome, String email) {
    public DadoContato {
        if (nome == null || nome.isBlank()) throw new IllegalArgumentException("Nome inválido");
        if (email == null || !email.contains("@")) throw new IllegalArgumentException("E-mail inválido");
    }
    public static void main(String[] args){DadoContato d=new DadoContato("Ana","ana@unicap.br");System.out.println(d.nome()+" / "+d.email());}
}
