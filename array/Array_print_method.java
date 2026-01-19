
// all arrays are in traversal = visiting each element of the array exactly once in a sequential manners.
/*There are serval method to print entire 1D and 2D arrays,  
1) Print 1D array using Array.toString(); instead using for loop
2) using for loop to print 1D and 2D arrays 
3) Print 2D array using Arrays.deepToString(); print entire 2D array.

Note :- also use sorting and binarySearch to find index of element

*/
import java.util.Arrays;

public class Array_print_method {
    public static void main(String[] args) {
        // get multi-dimensional Array
        int multi[][] = {
                { 1, 2, 3, 4, 5 },
                { 6, 7, 8, 9, 10 }
        };

        System.out.print("\n2D array print using deepToString() :");
        System.out.print("\n" + Arrays.deepToString(multi) + "\n");
        // get 3rd multi-dimensional Arrays
        int arr3[][] = {
                { 123, 345, 567, 789 },
                { 234, 456, 678, 8910 },
                { 111, 222, 333, 444 }
        };
        System.out.println();
        System.out.print("3D array using for loop : \n");
        // for loop + toString();
        for (int[] row : arr3) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println();

        // get 2nd Array
        int arr2[] = { 44, 33, 22, 11 };
        System.out.println("Using toString function : " + Arrays.toString(arr2));
        // sort the array using sort()
        Arrays.sort(arr2);
        System.out.println("Sort the arrays element : " + Arrays.toString(arr2));

        // find index of element using binarySearch
        int find = 22;
        System.out.print("\n" + find + " found at index : " + Arrays.binarySearch(arr2, find));
        System.out.print("\n");

    }
}