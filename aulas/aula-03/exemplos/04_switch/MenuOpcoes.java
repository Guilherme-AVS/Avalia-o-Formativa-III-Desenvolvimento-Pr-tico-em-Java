import java.util.Scanner;

public class MenuOpcoes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("CALCULADORA BÁSICA");
        System.out.println("1 - Soma");
        System.out.println("2 - Subtração");
        System.out.println("3 - Multiplicação");
        System.out.println("4 - Divisão");
        System.out.print("Escolha uma operação: ");

        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                System.out.println("Você escolheu Soma");
                break;
            case 2:
                System.out.println("Você escolheu Subtração");
                break;
            case 3:
                System.out.println("Você escolheu Multiplicação");
                break;
            case 4:
                System.out.println("Você escolheu Divisão");
                break;
            default:
                System.out.println("Opção inválida!");
        }

        scanner.close();
    }
}
