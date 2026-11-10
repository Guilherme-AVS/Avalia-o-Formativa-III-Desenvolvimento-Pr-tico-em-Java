public class AlunoConstrutor {
    private String nome;
    private String matricula;

    public AlunoConstrutor(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public void exibir() {
        System.out.println(nome + " | matrícula: " + matricula);
    }

    public static void main(String[] args) {
        AlunoConstrutor aluno = new AlunoConstrutor("Maria", "2026001");
        aluno.exibir();
    }
}
