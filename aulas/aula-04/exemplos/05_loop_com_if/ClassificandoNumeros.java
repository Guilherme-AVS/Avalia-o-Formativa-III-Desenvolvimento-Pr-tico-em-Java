public class ClassificandoNumeros {
    public static void main(String[] args) {
        for (int i = -3; i <= 3; i++) {
            if (i > 0) {
                System.out.println(i + " -> positivo");
            } else if (i < 0) {
                System.out.println(i + " -> negativo");
            } else {
                System.out.println(i + " -> zero");
            }
        }
    }
}
