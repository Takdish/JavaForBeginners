import java.util.Scanner;

public class threeSum {
    public static boolean tripleSum(int[] arr, int FindSum){

        for(int i =0; i<arr.length; i++){
            int j = i+1;
            int last = arr.length-1;

            while(j<last){
               int sum = arr[i] +arr[j] + arr[last];

                if(sum==FindSum){
                    return true;
                }else if(sum<FindSum){
                    j++;
                }else{
                    last--;
                }
            }

        }
        return false;
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
        System.out.print("Enter Target : ");
        int FindSum = sc.nextInt();

        System.out.println(tripleSum(arr, FindSum));

    }
}
