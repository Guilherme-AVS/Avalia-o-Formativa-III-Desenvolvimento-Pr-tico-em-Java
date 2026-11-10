public class NormalizadorEmail {
    public static String normalizar(String email) {
        return email.trim().toLowerCase();
    }

    public static boolean possuiDominioUnicap(String email) {
        return email.endsWith("@unicap.br");
    }

    public static void main(String[] args) {
        String original = " ALUNO@UNICAP.BR ";

        String normalizado = normalizar(original);

        System.out.println("Original: [" + original + "]");
        System.out.println("Normalizado: [" + normalizado + "]");
        System.out.println("Domínio UNICAP? " +
                possuiDominioUnicap(normalizado));
    }
}
