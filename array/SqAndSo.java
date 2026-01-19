import java.util.Arrays;

public class SqAndSo {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        int[] arr = new int[] { -4, -1, 0, 3, 10 };
        // square and Short
        for (int i = 0; i < arr.length; i++) {
            int sq = arr[i] * arr[i];
            System.out.print(sq + " ");
        }
        Arrays.sort(arr);
        System.out.println();
        System.out.println(Arrays.toString(arr));
    }
}
