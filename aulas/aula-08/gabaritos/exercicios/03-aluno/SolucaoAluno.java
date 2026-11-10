public class SolucaoAluno {
    private String nome;
    private String matricula;
    private double nota1;
    private double nota2;

    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    public void exibirSituacao() {
        System.out.println(nome + " — média: " + calcularMedia());
    }

    public static void main(String[] args) {
        SolucaoAluno aluno = new SolucaoAluno();
        aluno.nome = "Ana";
        aluno.matricula = "2026001";
        aluno.nota1 = 8.0;
        aluno.nota2 = 9.0;
        aluno.exibirSituacao();
    }
}
