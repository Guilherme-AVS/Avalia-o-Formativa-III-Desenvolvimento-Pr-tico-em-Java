import java.util.Scanner;

public class Gabarito05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String palavra = sc.nextLine();

        System.out.println(palavra.length() > 10);

        sc.close();
    }
}
