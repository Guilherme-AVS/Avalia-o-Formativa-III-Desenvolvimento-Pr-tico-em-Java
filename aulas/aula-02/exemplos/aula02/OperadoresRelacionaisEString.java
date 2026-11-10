public class OperadoresRelacionaisEString {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= 10: " + (a >= 10));
        System.out.println("b <= 20: " + (b <= 20));

        String s1 = "abc";
        String s2 = new String("abc");

        System.out.println("s1.equals(s2): " + s1.equals(s2));
    }
}
