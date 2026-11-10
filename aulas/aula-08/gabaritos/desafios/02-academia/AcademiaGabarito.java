import java.util.ArrayList;
import java.util.List;

public class AcademiaGabarito {
    static class Plano {
        private String tipo;
        private double valor;
        private boolean ativo;

        Plano(String tipo, double valor) {
            this.tipo = tipo;
            this.valor = valor;
        }

        public void ativar() {
            ativo = true;
        }
    }

    static class Instrutor {
        private String nome;
        private List<Aluno> alunos = new ArrayList<>();

        Instrutor(String nome) {
            this.nome = nome;
        }

        public void adicionarAluno(Aluno aluno) {
            alunos.add(aluno);
        }
    }

    static class Aluno {
        private String nome;
        private Plano plano;
        private Instrutor instrutor;

        Aluno(String nome) {
            this.nome = nome;
        }

        public void ativarPlano(Plano plano) {
            this.plano = plano;
            plano.ativar();
        }

        public void vincularInstrutor(Instrutor instrutor) {
            this.instrutor = instrutor;
            instrutor.adicionarAluno(this);
        }
    }

    public static void main(String[] args) {
        Plano plano = new Plano("Mensal", 129.90);
        Instrutor instrutor = new Instrutor("Marina");
        Aluno aluno = new Aluno("Ana");

        aluno.ativarPlano(plano);
        aluno.vincularInstrutor(instrutor);

        System.out.println("Modelo de academia criado.");
    }
}
