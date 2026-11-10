import java.util.Arrays;

public class CopiarArray {
    public static void main(String[] args) {
        int[] original = {10, 20, 30};
        int[] copia = Arrays.copyOf(original, original.length);

        copia[0] = 999;

        System.out.println("Original: " + Arrays.toString(original));
        System.out.println("Cópia: " + Arrays.toString(copia));
    }
}
