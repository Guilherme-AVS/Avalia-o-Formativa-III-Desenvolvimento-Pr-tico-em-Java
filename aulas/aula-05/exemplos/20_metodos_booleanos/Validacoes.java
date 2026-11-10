public class Validacoes {
    public static boolean ePar(int n) {
        return n % 2 == 0;
    }

    public static boolean ePositivo(int n) {
        return n > 0;
    }

    public static boolean eMaiorDeIdade(int idade) {
        return idade >= 18;
    }

    public static void main(String[] args) {
        System.out.println("8 é par? " + ePar(8));
        System.out.println("-3 é positivo? " + ePositivo(-3));
        System.out.println("20 é maior de idade? " + eMaiorDeIdade(20));
    }
}
