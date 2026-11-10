public class IncrementoEDecremento {
    public static void main(String[] args) {
        int a = 5;

        System.out.println("pos-incremento: " + a++);
        System.out.println("depois: " + a);

        int b = 10;

        System.out.println("pre-incremento: " + (++b));
        System.out.println("depois: " + b);

        int c = 3;
        System.out.println("pre-decremento: " + (--c));
        System.out.println("pos-decremento: " + c--);
        System.out.println("depois: " + c);
    }
}
