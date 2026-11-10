import java.util.Scanner;

public class GabaritoNormalizadorCadastro {
    public static String normalizarNome(String nome) {
        return nome.trim().toUpperCase();
    }

    public static String normalizarEmail(String email) {
        return email.trim().toLowerCase();
    }

    public static boolean emailValido(String email) {
        return email.contains("@") && email.endsWith(".br");
    }

    public static boolean cidadeIgual(String cidade, String procurada) {
        return cidade.trim().equalsIgnoreCase(procurada.trim());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = sc.nextLine();
        String email = sc.nextLine();
        String cidade = sc.nextLine();

        String nomeN = normalizarNome(nome);
        String emailN = normalizarEmail(email);

        System.out.println(nomeN);
        System.out.println(emailN);
        System.out.println(emailValido(emailN));
        System.out.println(cidadeIgual(cidade, "Recife"));

        sc.close();
    }
}
