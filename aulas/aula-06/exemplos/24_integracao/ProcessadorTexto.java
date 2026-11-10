public class ProcessadorTexto {
    public static String normalizar(String texto) {
        return texto.trim().toLowerCase();
    }

    public static boolean contemJava(String texto) {
        return texto.contains("java");
    }

    public static int tamanho(String texto) {
        return texto.length();
    }

    public static void exibirRelatorio(String texto) {
        String normalizado = normalizar(texto);

        System.out.println("Original: [" + texto + "]");
        System.out.println("Normalizado: [" + normalizado + "]");
        System.out.println("Tamanho: " + tamanho(normalizado));
        System.out.println("Contém Java? " + contemJava(normalizado));
    }

    public static void main(String[] args) {
        exibirRelatorio("  Aprendendo Java na UNICAP  ");
    }
}
