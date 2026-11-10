public class ComparacaoWhileDoWhile {
    public static void main(String[] args) {
        int numeroWhile = 10;

        while (numeroWhile < 5) {
            System.out.println("while: " + numeroWhile);
        }

        int numeroDoWhile = 10;

        do {
            System.out.println("do-while: " + numeroDoWhile);
        } while (numeroDoWhile < 5);
    }
}
