public class ReplaceAll {
    public static void main(String[] args) {
        String texto = "abc123def45";

        String resultado = texto.replaceAll("\\d+", "");

        System.out.println("Original: " + texto);
        System.out.println("Sem dígitos: " + resultado);
    }
}
