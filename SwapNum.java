public class SwapNum { 
    public static void main(String[] args) {
        int a =20,b=10;
        a = a+b; // a =30
        b = a-b; // b =20 
        a = a-b; // a =10 
        System.err.print("a = " + a + "\n" + "b = " + b);
    }
}