public class PessoaAluno {
    static class Pessoa {
        private String nome;

        public Pessoa(String nome) {
            this.nome = nome;
        }

        public String getNome() {
            return nome;
        }
    }

    static class Aluno extends Pessoa {
        private String matricula;

        public Aluno(String nome, String matricula) {
            super(nome);
            this.matricula = matricula;
        }

        public void exibir() {
            System.out.println(getNome() + " | " + matricula);
        }
    }

    public static void main(String[] args) {
        new Aluno("Maria", "2026001").exibir();
    }
}
