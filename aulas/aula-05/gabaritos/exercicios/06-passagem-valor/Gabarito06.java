public class Gabarito06 {
    public static void tentarAlterar(int x) { x = 99; }
    public static void main(String[] args) {
        int n = 5;
        tentarAlterar(n);
        System.out.println(n);
    }
}
