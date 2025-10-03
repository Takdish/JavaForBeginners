import java.util.Arrays;

public class ArraySort2 {
    public static void main(String[] args) {
        // declare a any arrays
        int a[] = { -1, -2, 5, 4, 3, 64, 88 };

        // sort the array in the range of 1 to 5;
        Arrays.sort(a, 1, 5);

        // print all the array element without using for loop;
        System.out.println(Arrays.toString(a));
    }
}