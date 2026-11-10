public class PesquisaString {
    public static void main(String[] args) {
        String email = "aluno@unicap.br";
        String texto = "Programação Java";

        System.out.println("Possui @? " + email.contains("@"));
        System.out.println("Começa com aluno? " + email.startsWith("aluno"));
        System.out.println("Termina com .br? " + email.endsWith(".br"));
        System.out.println("Java começa no índice: " + texto.indexOf("Java"));
        System.out.println("Último a: " + texto.lastIndexOf("a"));
    }
}
