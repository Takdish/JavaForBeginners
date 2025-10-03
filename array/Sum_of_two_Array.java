
public class Sum_of_two_Array {

    public static void main(String[] args) {
        int sumFal = 0;
        int sumTak = 0;
        int[] fal = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] tak = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};

        for (int i = 0; i < fal.length; i++) {
            sumFal += fal[i];
        }
        System.out.println("The sum of fal: " + sumFal);

        for (int j = 0; j < tak.length; j++) {
            sumTak += tak[j];
        }
        System.out.println("The sum of tak: " + sumTak);

        int totalSum = sumFal + sumTak;
        System.out.println("Total Sum: " + totalSum);
    }
}