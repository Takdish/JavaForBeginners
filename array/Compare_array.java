// Java program to demonstrate
// Arrays.compare() method 

//import java.lang.reflect.Array;
import java.util.Arrays;

public class Compare_array {
    public static void main(String[] args) {
        // to get 1st array
        int[] arr01 = { 10, 20, 30, 40 };

        // to get 2nd array
        int arr02[] = { 10, 30, 50, 60 };

        System.out.println("Compare two arrays : " + Arrays.compareUnsigned(arr01, arr02));
    }
}
