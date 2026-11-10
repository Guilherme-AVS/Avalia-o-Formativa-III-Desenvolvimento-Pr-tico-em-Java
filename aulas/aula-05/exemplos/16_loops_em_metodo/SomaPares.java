public class SomaPares {
    public static int somarParesAte(int limite) {
        int soma = 0;
        for (int i = 1; i <= limite; i++) {
            if (i % 2 == 0) {
                soma += i;
            }
        }
        return soma;
    }

    public static void main(String[] args) {
        System.out.println("Soma: " + somarParesAte(10));
    }
}
