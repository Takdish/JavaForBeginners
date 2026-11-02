package Recursion;

public class SumOfElement {
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        int add = sum(n-1);
        return n + sum(n-1);
    }
    static void main() {
        System.out.println(sum(5));
    }
}
