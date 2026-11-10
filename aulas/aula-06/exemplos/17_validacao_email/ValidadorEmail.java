public class ValidadorEmail {
    public static boolean emailValido(String email) {
        return email.contains("@") && email.endsWith(".br");
    }

    public static void main(String[] args) {
        String email = "aluno@unicap.br";

        System.out.println("E-mail: " + email);
        System.out.println("Válido? " + emailValido(email));
    }
}
