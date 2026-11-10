public class TamanhoECaractere {
    public static void main(String[] args) {
        String nome = "Maria";

        System.out.println("Tamanho: " + nome.length());
        System.out.println("Primeiro: " + nome.charAt(0));
        System.out.println("Último: " + nome.charAt(nome.length() - 1));
    }
}
