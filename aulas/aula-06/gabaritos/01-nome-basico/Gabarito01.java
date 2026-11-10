import java.util.Scanner;

public class Gabarito01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome = sc.nextLine();

        System.out.println(nome.length());
        System.out.println(nome.charAt(0));
        System.out.println(nome.charAt(nome.length() - 1));

        sc.close();
    }
}
