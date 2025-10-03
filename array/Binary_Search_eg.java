/* Java Program to Demonstrate Arrays Class
 Via binarySearch() method 
 
 To find a index of specific element = use binarySearch algorithm. 
 binarySearch(array, fromIndex, toIndex, key, Comparator) . */

import java.util.Arrays;

public class Binary_Search_eg {
    public static void main(String[] args) {
        int arry[] = { 43, 22, 11, 53, 67, 864, 434, 2, 5, 6, 7, 44, 123, 321, 1223, 23311, 2344, 532, 12345, 543221,
                43212, 45642, 6675, 3432, 6788, 9, 77655, 9089 };
        Arrays.sort(arry);
        int find = 864; // to find the element in which index they are store.

        System.out.print("The sort arrays are : \n ");
        for (int i = 0; i < arry.length; i++) {
            System.out.print(arry[i] + " ");
        }

        /*
         * 1 and 20 are the index range,
         * to find a index of specific element between 1 to 20
         */

        System.out.println("\n" + find + " found at index : " + Arrays.binarySearch(arry, 1, 20, find));
    }
}
