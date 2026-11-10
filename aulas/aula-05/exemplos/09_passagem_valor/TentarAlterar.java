public class TentarAlterar {
    public static void tentarAlterar(int x) {
        x = 99;
        System.out.println("Dentro do método: " + x);
    }

    public static void main(String[] args) {
        int n = 5;

        tentarAlterar(n);

        System.out.println("Fora do método: " + n);
    }
}
