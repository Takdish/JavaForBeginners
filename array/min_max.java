import java.util.Arrays;
import java.util.Scanner;

public class min_max {
    public static void main(String[] args) {
        int min;
        int max;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array:");
        int n = sc.nextInt();
        int[] arr = new int[n]; // create a new array object.
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        min = arr[0];
        max = arr[arr.length - 1];
        System.out.println("Minimum element: " + min);
        System.out.println("Maximum element: " + max);
        sc.close();

    }
}
