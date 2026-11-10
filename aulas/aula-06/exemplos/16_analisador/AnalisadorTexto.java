import java.util.Scanner;

public class AnalisadorTexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite uma frase: ");
        String frase = sc.nextLine();

        System.out.println("Texto original: " + frase);

        if (!frase.isEmpty()) {
            System.out.println("Quantidade de caracteres: " + frase.length());
            System.out.println("Maiúsculas: " + frase.toUpperCase());
            System.out.println("Minúsculas: " + frase.toLowerCase());
            System.out.println("Primeiro caractere: " + frase.charAt(0));
            System.out.println("Último caractere: " +
                    frase.charAt(frase.length() - 1));
            System.out.println("Contém \"Java\"?: " + frase.contains("Java"));
        } else {
            System.out.println("A frase está vazia.");
        }

        sc.close();
    }
}
