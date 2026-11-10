import java.util.Scanner;

public class Gabarito10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String nome = sc.nextLine();

        String normalizado = nome.trim().toUpperCase();

        System.out.println(normalizado);

        sc.close();
    }
}
