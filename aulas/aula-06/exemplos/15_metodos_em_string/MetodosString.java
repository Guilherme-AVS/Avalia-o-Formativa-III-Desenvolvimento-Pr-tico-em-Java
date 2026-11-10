public class MetodosString {
    public static void main(String[] args) {
        String texto = "Java";

        System.out.println(texto.length());
        System.out.println(texto.charAt(0));
        System.out.println(texto.equals("Java"));
        System.out.println(texto.toUpperCase());
        System.out.println(texto.toLowerCase());
        System.out.println(" ok ".trim());
        System.out.println(texto.contains("av"));
        System.out.println(texto.substring(0, 2));
        System.out.println(texto.replace("a", "o"));
        System.out.println(texto.indexOf("v"));
    }
}
