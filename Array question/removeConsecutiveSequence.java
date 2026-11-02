import java.util.Arrays;
import java.util.Stack;
import java.util.*;
public class removeConsecutiveSequence {
    public static int[] remove(int[] arr){
        int n = arr.length;
        Stack<Integer> stack = new Stack<>();
        for(int i =0; i<n; i++){
            if(stack.isEmpty() || stack.peek()!=arr[i]){
                stack.push(arr[i]);
            }
            else if(arr[i]==stack.peek()){
                if(i==n-1 || arr[i]!=arr[i+1]) stack.pop();
            }
        }
        int[] result = new int[stack.size()];
        int m = result.length;
        for(int i =m-1; i>=0; i--){
            result[i] = stack.pop();
        }
        return result;
    }
    static void main() {
        int[] arr  = {1,2,2,3,10,10,10,4,4,4,5,7,7};
        int n = arr.length;
        int[] result = remove(arr);
        for(int i=0; i<result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
}
