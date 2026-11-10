public class Gabarito03 {
    public static boolean ePar(int n) { return n % 2 == 0; }
    public static boolean ePositivo(int n) { return n > 0; }
    public static boolean eMaiorDeIdade(int idade) { return idade >= 18; }
    public static void main(String[] args) {
        System.out.println(ePar(8));
        System.out.println(ePositivo(-2));
        System.out.println(eMaiorDeIdade(20));
    }
}
