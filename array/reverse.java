
import java.util.Arrays;

public class reverse {

    public static void main(String[] args) {
        int[] tak = { 32, 65, 10, 15, 86, 45, 87, 4, 3, 2, 8, 6, 5, 55, 77 }; // n.
        // sort = arrange in accending order
        Arrays.sort(tak);
        // System.out.println(tak + " ");
        int n = tak.length;
        // in this case they arrange in decending order using For loop.

        for (int i = n - 1; i >= 0; i--) {
            System.out.println(tak[i]);
        }
    }
}
