public class Aluno {
    private String nome;
    private String matricula;
    private double nota1;
    private double nota2;

    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("Preencha");
        System.out.println(aluno.getNome());
        System.out.println("Complete a modelagem.");
    }
}
