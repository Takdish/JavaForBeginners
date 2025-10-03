
import java.util.Arrays;


public class Half_Reverse {

    public static void main(String[] args) {
        int[] half = {1, 2, 3, 5, 6, 7, 8, 9, 90, 89, 55, 33, 22, 77, 66, 88, 99, 32, 45, 999};
        int n = half.length;
        Arrays.sort(half);
        for (int i = n - 1; i > n/2; i--) {
            System.out.print(half[i] + " ");
        }
        for (int j = 0; j <= 10; j++) {
            System.out.print(half[j] + " ");
        }
    }
}
