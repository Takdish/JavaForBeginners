package Recursion;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTarget {
    public static boolean find(int[] arr, int target, int index){
        if(index==arr.length){
            return false;
        }
        if(arr[index] == target){
            return true;
        }
        return find(arr, target, index+1);
    }

    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the elements: ");
        int n = arr.length;

        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        System.out.print("Enter the target element: ");
        int target = sc.nextInt();
        System.out.println(find(arr,target,0));

    }
}
