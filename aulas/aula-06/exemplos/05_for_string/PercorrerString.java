public class PercorrerString {
    public static void main(String[] args) {
        String palavra = "Java";

        for (int i = 0; i < palavra.length(); i++) {
            System.out.println("[" + i + "] " + palavra.charAt(i));
        }
    }
}
