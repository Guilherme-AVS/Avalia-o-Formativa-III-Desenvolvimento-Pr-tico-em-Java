public class EscolhaEstrutura {
    public static void main(String[] args) {
        int nota = 8;
        int opcao = 2;

        // Intervalos: if-else if é apropriado.
        if (nota >= 7) {
            System.out.println("Nota suficiente.");
        } else {
            System.out.println("Nota abaixo do critério.");
        }

        // Igualdade exata de uma expressão: switch é apropriado.
        switch (opcao) {
            case 1:
                System.out.println("Cadastrar");
                break;
            case 2:
                System.out.println("Consultar");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
}
