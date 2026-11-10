public class CompararStrings {
    public static void main(String[] args) {
        String a = "Java";
        String b = new String("Java");

        System.out.println("equals: " + a.equals(b));
        System.out.println("equalsIgnoreCase: " + "JAVA".equalsIgnoreCase("java"));
        System.out.println("==: " + (a == b));

        // O == compara referências; equals() compara conteúdo.
    }
}
