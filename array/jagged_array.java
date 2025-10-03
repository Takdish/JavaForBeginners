public class jagged_array {
    public static void main(String args[]) {

        int arr[][] = {
                { 2, 3, 1 },
                { 5, 67, 865, 4 },
                { 1, 90, 99, 98, 867, 9984 }
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }
        }
    }
}