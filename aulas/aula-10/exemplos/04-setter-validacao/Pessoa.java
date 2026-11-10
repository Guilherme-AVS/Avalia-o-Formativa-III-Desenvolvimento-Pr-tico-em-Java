public class Pessoa {
    private String nome;
    private int idade;

    public String getNome() { return nome; }
    public void setNome(String nome) {
        if (nome != null && !nome.trim().isEmpty()) this.nome = nome.trim();
        else System.out.println("Nome inválido!");
    }
    public int getIdade() { return idade; }
    public void setIdade(int idade) {
        if (idade >= 0 && idade <= 120) this.idade = idade;
        else System.out.println("Idade inválida: " + idade);
    }
    public static void main(String[] args) {
        Pessoa p = new Pessoa(); p.setNome(" Ana Lima "); p.setIdade(22); p.setIdade(-5);
        System.out.println(p.getNome()+" / "+p.getIdade());
    }
}
