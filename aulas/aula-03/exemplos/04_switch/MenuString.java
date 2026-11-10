import java.util.Scanner;

public class MenuString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o perfil (ADMIN, PROFESSOR ou ALUNO): ");
        String perfil = scanner.nextLine();

        switch (perfil) {
            case "ADMIN":
                System.out.println("Acesso administrativo.");
                break;
            case "PROFESSOR":
                System.out.println("Acesso docente.");
                break;
            case "ALUNO":
                System.out.println("Acesso discente.");
                break;
            default:
                System.out.println("Perfil desconhecido.");
        }

        scanner.close();
    }
}
