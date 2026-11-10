import java.util.Scanner;

public class Gabarito04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String email = sc.nextLine().trim();

        boolean valido = email.contains("@") && email.endsWith(".br");

        System.out.println(valido);
        sc.close();
    }
}
