public class Informacoes {
    public static void exibirInfo(String nome, int idade) {
        System.out.println(nome + " tem " + idade + " anos.");
    }

    public static void main(String[] args) {
        exibirInfo("Ana", 20);
        exibirInfo("Carlos", 21);
    }
}
