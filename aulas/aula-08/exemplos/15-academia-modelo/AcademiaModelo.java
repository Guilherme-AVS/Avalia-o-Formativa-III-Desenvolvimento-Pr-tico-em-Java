import java.util.ArrayList;
import java.util.List;

public class AcademiaModelo {
    static class Plano {
        private String tipo;
        private double valor;
        private int duracaoMeses;
        private boolean ativo;

        Plano(String tipo, double valor, int duracaoMeses) {
            this.tipo = tipo;
            this.valor = valor;
            this.duracaoMeses = duracaoMeses;
        }

        public void ativar() {
            ativo = true;
        }

        public boolean isAtivo() {
            return ativo;
        }

        public String getTipo() {
            return tipo;
        }

        public double getValor() {
            return valor;
        }

        public int getDuracaoMeses() {
            return duracaoMeses;
        }
    }

    static class Aluno {
        private String nome;
        private String cpf;
        private Plano plano;
        private Instrutor instrutor;

        Aluno(String nome, String cpf) {
            this.nome = nome;
            this.cpf = cpf;
        }

        public void ativarPlano(Plano plano) {
            this.plano = plano;
            plano.ativar();
        }

        public void vincularInstrutor(Instrutor instrutor) {
            this.instrutor = instrutor;
            instrutor.adicionarAluno(this);
        }

        public String getNome() {
            return nome;
        }

        public String getCpf() {
            return cpf;
        }

        public Plano getPlano() {
            return plano;
        }

        public Instrutor getInstrutor() {
            return instrutor;
        }
    }

    static class Instrutor {
        private String nome;
        private String cref;
        private List<Aluno> alunos = new ArrayList<>();

        Instrutor(String nome, String cref) {
            this.nome = nome;
            this.cref = cref;
        }

        public void adicionarAluno(Aluno aluno) {
            alunos.add(aluno);
        }

        public List<Aluno> getAlunos() {
            return alunos;
        }

        public String getNome() {
            return nome;
        }

        public String getCref() {
            return cref;
        }
    }

    public static void main(String[] args) {
        Plano plano = new Plano("Mensal", 129.90, 1);
        Instrutor instrutor = new Instrutor("Marina", "CREF-123");
        Aluno aluno = new Aluno("Ana", "123.456.789-00");

        aluno.ativarPlano(plano);
        aluno.vincularInstrutor(instrutor);

        System.out.println(aluno.getNome());
        System.out.println("Plano ativo: " + aluno.getPlano().isAtivo());
        System.out.println("Instrutor: " + aluno.getInstrutor().getNome());
        System.out.println("Alunos do instrutor: " + instrutor.getAlunos().size());
    }
}
