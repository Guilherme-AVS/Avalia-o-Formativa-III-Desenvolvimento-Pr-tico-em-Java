public class Imutabilidade {
    public static void main(String[] args) {
        String nome = "Maria";

        nome.toUpperCase();
        System.out.println("Depois de chamar sem guardar: " + nome);

        nome = nome.toUpperCase();
        System.out.println("Depois de guardar o retorno: " + nome);
    }
}
