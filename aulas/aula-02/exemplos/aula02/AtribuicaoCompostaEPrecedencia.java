public class AtribuicaoCompostaEPrecedencia {
    public static void main(String[] args) {
        int x = 10;
        x += 5;
        System.out.println("x += 5 -> " + x);

        x -= 3;
        System.out.println("x -= 3 -> " + x);

        x *= 2;
        System.out.println("x *= 2 -> " + x);

        x /= 4;
        System.out.println("x /= 4 -> " + x);

        x %= 3;
        System.out.println("x %= 3 -> " + x);

        int resultado = 5 + 3 * 2;
        boolean teste = 10 > 5 && 20 <= 30 || 4 == 4;
        int valor = 4 + 5 * 2 / 10;

        System.out.println("5 + 3 * 2 = " + resultado);
        System.out.println("teste = " + teste);
        System.out.println("4 + 5 * 2 / 10 = " + valor);

        int comParenteses = (5 + 3) * 2;
        System.out.println("(5 + 3) * 2 = " + comParenteses);
    }
}
