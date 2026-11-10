import java.util.Scanner;

public class Gabarito07 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String a = sc.nextLine();
        String b = sc.nextLine();

        int resultado = a.compareToIgnoreCase(b);

        if (resultado < 0) {
            System.out.println(a + " vem antes.");
        } else if (resultado > 0) {
            System.out.println(b + " vem antes.");
        } else {
            System.out.println("Equivalentes.");
        }

        sc.close();
    }
}
