public class ArrayDeStrings {
    public static void main(String[] args) {
        String[] nomes = {"Ana", "Bruno", "Carlos"};

        for (String nome : nomes) {
            System.out.println(nome + " tem " + nome.length() + " caracteres.");
        }
    }
}
