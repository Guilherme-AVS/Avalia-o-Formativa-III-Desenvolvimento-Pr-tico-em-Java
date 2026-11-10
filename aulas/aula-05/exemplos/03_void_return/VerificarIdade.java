public class VerificarIdade {
    public static void verificarIdade(int idade) {
        if (idade < 0) {
            System.out.println("Idade inválida!");
            return;
        }
        System.out.println("Idade: " + idade);
    }

    public static void main(String[] args) {
        verificarIdade(-1);
        verificarIdade(20);
    }
}
