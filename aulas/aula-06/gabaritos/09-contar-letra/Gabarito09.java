import java.util.Scanner;

public class Gabarito09 {
    public static int contar(String texto, char procurado) {
        int contador = 0;

        for (int i = 0; i < texto.length(); i++) {
            if (Character.toLowerCase(texto.charAt(i))
                    == Character.toLowerCase(procurado)) {
                contador++;
            }
        }

        return contador;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String frase = sc.nextLine();
        char letra = sc.nextLine().charAt(0);

        System.out.println(contar(frase, letra));

        sc.close();
    }
}
