import java.util.Scanner;

public class Gabarito08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = sc.nextLine().trim();
        int espaco = nome.indexOf(" ");

        String primeiro = espaco == -1
                ? nome
                : nome.substring(0, espaco);

        System.out.println(primeiro);

        sc.close();
    }
}
