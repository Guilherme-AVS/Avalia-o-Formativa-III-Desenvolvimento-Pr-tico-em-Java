public class ComparacaoLexicografica {
    public static void main(String[] args) {
        String a = "Ana";
        String b = "Bruno";

        int resultado = a.compareTo(b);

        if (resultado < 0) {
            System.out.println(a + " vem antes de " + b);
        } else if (resultado > 0) {
            System.out.println(a + " vem depois de " + b);
        } else {
            System.out.println("Textos equivalentes.");
        }

        System.out.println("Ignorando caixa: " +
                "java".compareToIgnoreCase("JAVA"));
    }
}
