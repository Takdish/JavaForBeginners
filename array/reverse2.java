import java.util.Arrays;
import java.util.Collections;

public class reverse2 {
    public static void main(String[] args) {
        // declare any array...
        /*
         * This line throws a compile-time error because
         * Collections.reverseOrder() is used for sorting objects (like Integer[]),
         * not primitives (int[]).
         */
        Integer[] tak = { 32, 65, 10, 15, 86, 45, 87, 4, 3, 2, 8, 6, 5, 55, 77 }; //

        // Sort the array in descending order using
        // reverseOrder() method of Collections class

        Arrays.sort(tak, Collections.reverseOrder());
        System.out.println(Arrays.toString(tak)); 
    }

}