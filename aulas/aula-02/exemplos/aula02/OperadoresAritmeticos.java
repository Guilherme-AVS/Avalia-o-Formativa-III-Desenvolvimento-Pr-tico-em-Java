public class OperadoresAritmeticos {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        int divisao = a / b;
        int resto = a % b;

        int x = 5 / 2;
        double y = 5 / 2;
        double z = 5.0 / 2;

        System.out.println("soma = " + soma);
        System.out.println("subtracao = " + subtracao);
        System.out.println("multiplicacao = " + multiplicacao);
        System.out.println("divisao inteira = " + divisao);
        System.out.println("resto = " + resto);
        System.out.println("5 / 2 como int = " + x);
        System.out.println("5 / 2 atribuido a double = " + y);
        System.out.println("5.0 / 2 = " + z);
    }
}
