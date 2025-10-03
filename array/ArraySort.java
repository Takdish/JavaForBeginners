
import java.util.Arrays;

public class ArraySort {

    public static void main(String[] args) {
        int[] arr = { 32, 4, 1, 56, 75, 321, 86, 8, 9, 6 };
        Arrays.sort(arr); // Corrected sorting method
        for (int i = 0; i < arr.length; i++) { // .length find the index/elements in an array
            System.out.print(arr[i] + " "); // Prints the third element of the sorted array
        }
    }
}