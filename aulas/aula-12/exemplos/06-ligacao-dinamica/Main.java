public class Main {
    public static void main(String[] args) {
        Funcionario f1 = new Funcionario();
        Funcionario f2 = new Gerente();
        Funcionario f3 = new Diretor();
        f1.apresentar();
        f2.apresentar();
        f3.apresentar();
    }
}
