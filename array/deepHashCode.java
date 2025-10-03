// Java program to demonstrate
// Arrays.deepHashCode() method

import java.util.Arrays;

public class deepHashCode {
    public static void main(String[] args) {
        int matrix[][] = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 }
        };

        int Hash = Arrays.deepHashCode(matrix);
        System.out.println("Deep hash code of the 2D array: " + Hash);
    }
}
