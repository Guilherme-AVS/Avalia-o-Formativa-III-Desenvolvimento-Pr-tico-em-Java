public class Substituicao {
    public static void main(String[] args) {
        String texto = "Java é fácil";

        String novoTexto = texto.replace("fácil", "poderoso");

        System.out.println("Original: " + texto);
        System.out.println("Novo: " + novoTexto);
    }
}
