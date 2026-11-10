public class Estudante extends Pessoa {
    private final String curso;
    public Estudante(String nome, String curso) { super(nome); this.curso = curso; }
    @Override public String toString() { return "Estudante{" + super.toString() + ", curso='" + curso + "'}"; }
}
