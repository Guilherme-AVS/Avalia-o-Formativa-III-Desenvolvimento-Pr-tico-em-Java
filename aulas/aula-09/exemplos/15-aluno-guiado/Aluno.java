import java.util.Arrays;

public class Aluno {
    private String nome;
    private String matricula;
    private double[] notas;
    private String curso;

    public Aluno(String nome, String matricula, double[] notas, String curso) {
        this.nome = (nome != null) ? nome : "Não informado";
        this.matricula = (matricula != null) ? matricula : "000000";
        this.notas = (notas != null) ? notas : new double[4];
        this.curso = (curso != null) ? curso : "Não informado";
    }

    public Aluno(String nome, String matricula, String curso) {
        this(nome, matricula, new double[4], curso);
    }

    public Aluno(String nome, String matricula) {
        this(nome, matricula, "Ciência da Computação");
    }

    public Aluno() {
        this("Novo Aluno", "000000");
    }

    public String toString() {
        return nome + " | " + matricula + " | " + curso + " | " + Arrays.toString(notas);
    }

    public static void main(String[] args) {
        System.out.println(new Aluno());
        System.out.println(new Aluno("Maria", "2026001"));
        System.out.println(new Aluno("João", "2026002", "Engenharia"));
        System.out.println(new Aluno("Ana", "2026003", new double[]{8, 9, 10, 7}, "Computação"));
    }
}
