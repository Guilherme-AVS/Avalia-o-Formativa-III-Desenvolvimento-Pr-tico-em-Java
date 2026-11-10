import java.util.Scanner;

public class Gabarito06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();

        System.out.println("Conteúdo: " + a.equals(b));
        System.out.println("Ignorando caixa: " + a.equalsIgnoreCase(b));

        sc.close();
    }
}
