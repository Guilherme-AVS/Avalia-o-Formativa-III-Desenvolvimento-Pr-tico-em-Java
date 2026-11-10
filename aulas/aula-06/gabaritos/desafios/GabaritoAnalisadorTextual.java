import java.util.Scanner;

public class GabaritoAnalisadorTextual {
    public static int contarCaractere(String texto, char procurado) {
        int contador = 0;

        for (int i = 0; i < texto.length(); i++) {
            if (Character.toLowerCase(texto.charAt(i))
                    == Character.toLowerCase(procurado)) {
                contador++;
            }
        }

        return contador;
    }

    public static int contarEspacos(String texto) {
        return contarCaractere(texto, ' ');
    }

    public static String primeiraPalavra(String texto) {
        texto = texto.trim();
        if (texto.isEmpty()) return "";

        int posicao = texto.indexOf(" ");
        return posicao == -1 ? texto : texto.substring(0, posicao);
    }

    public static String ultimaPalavra(String texto) {
        texto = texto.trim();
        if (texto.isEmpty()) return "";

        int posicao = texto.lastIndexOf(" ");
        return posicao == -1 ? texto : texto.substring(posicao + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Frase: ");
        String frase = sc.nextLine();

        System.out.print("Letra: ");
        String entrada = sc.nextLine();

        if (frase.trim().isEmpty() || entrada.isEmpty()) {
            System.out.println("Entrada inválida.");
            sc.close();
            return;
        }

        char letra = entrada.charAt(0);

        System.out.println("Caracteres: " + frase.length());
        System.out.println("Espaços: " + contarEspacos(frase));
        System.out.println("Primeira: " + primeiraPalavra(frase));
        System.out.println("Última: " + ultimaPalavra(frase));
        System.out.println("Ocorrências: " + contarCaractere(frase, letra));
        System.out.println("Maiúsculas: " + frase.toUpperCase());
        System.out.println("Minúsculas: " + frase.toLowerCase());

        sc.close();
    }
}
