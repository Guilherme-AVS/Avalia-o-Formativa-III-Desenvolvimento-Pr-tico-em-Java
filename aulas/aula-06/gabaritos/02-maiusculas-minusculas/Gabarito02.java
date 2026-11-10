import java.util.Scanner;

public class Gabarito02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palavra = sc.nextLine();

        System.out.println(palavra.toUpperCase());
        System.out.println(palavra.toLowerCase());

        sc.close();
    }
}
