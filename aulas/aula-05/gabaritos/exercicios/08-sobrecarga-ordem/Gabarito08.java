public class Gabarito08 {
    public static void exibir(String nome, int idade) {
        System.out.println(nome + " - " + idade);
    }
    public static void exibir(int idade, String nome) {
        System.out.println(idade + " - " + nome);
    }
    public static void main(String[] args) {
        exibir("Ana", 25);
        exibir(25, "Ana");
    }
}
