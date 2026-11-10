import java.util.Arrays;

public class CompararArrays {
    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int[] b = {1, 2, 3};
        int[] c = {1, 2, 4};

        System.out.println(Arrays.equals(a, b));
        System.out.println(Arrays.equals(a, c));
    }
}
