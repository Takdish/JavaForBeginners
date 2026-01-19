public class LargestElement {
    public static void main(String[] args) {
        int[] arr = new int[] { 100, 20, 31, 11, 12 };
        int largest = arr[0]; // Assume first element is the largest
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        System.out.println("The largest element is: " + largest);
    }
}
