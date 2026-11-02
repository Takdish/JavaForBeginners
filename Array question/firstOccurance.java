import java.util.Scanner;

public class firstOccurance {
    public static int firstrepeated(int[] arr){
        for(int i =0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i] == arr[j]){
                    return i;
                }
            }
        }
        return -1;
    }
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter element : ");
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }

        System.out.println(firstrepeated(arr));
    }
}
