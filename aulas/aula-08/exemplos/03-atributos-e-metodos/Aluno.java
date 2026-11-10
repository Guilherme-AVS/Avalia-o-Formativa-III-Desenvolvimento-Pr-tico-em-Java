public class Aluno {
    private String nome;
    private double nota1;
    private double nota2;

    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    public void exibirSituacao() {
        double media = calcularMedia();
        System.out.println(nome + ": " + media);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getNota1() {
        return nota1;
    }

    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public double getNota2() {
        return nota2;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public static void main(String[] args) {
        Aluno aluno = new Aluno();
        aluno.setNome("Ana");
        aluno.setNota1(8.0);
        aluno.setNota2(9.0);
        aluno.exibirSituacao();
    }
}
