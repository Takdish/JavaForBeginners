package Recursion;

public class BasicRecursion {
    public static void printNumber(int n){
        if(n==0){
            return;
        }
        System.out.print(n  + " ");
        printNumber(n-1);
        System.out.print(n + " ");
    }
    static void main() {
        printNumber(5);
    }
}
