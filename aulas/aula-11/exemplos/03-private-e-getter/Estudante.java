public class Estudante extends Pessoa {
    private final String curso;
    public Estudante(String nome, int idade, String curso) { super(nome, idade); this.curso = curso; }
    public void apresentar() { System.out.println(getNome() + " — " + getIdade() + " anos — " + curso); }
}
