public class ExibirSobrecarga {
    public static void exibir(String nome, int idade) {
        System.out.println("Nome: " + nome + ", Idade: " + idade);
    }

    public static void exibir(int idade, String nome) {
        System.out.println("Idade: " + idade + ", Nome: " + nome);
    }

    public static void main(String[] args) {
        exibir("Ana", 25);
        exibir(25, "Ana");
    }
}
