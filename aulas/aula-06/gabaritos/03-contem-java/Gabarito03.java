import java.util.Scanner;

public class Gabarito03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();

        System.out.println(frase.contains("Java"));

        sc.close();
    }
}
