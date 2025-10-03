
public class Terrary_operator {

    public static void main(String[] args) {
        int a = 29, b = 69;

        //variable = (condition) ? expressionTrue :  expressionFalse;
        int result = (a > b) ? a : b;
        System.out.println("The max : " + result );

        int t = 21, f = 32, c = 34;
        int result2 = (t > f) ? (t > c ? t : c) : (f > c) ? f : c; 
        System.out.print("The max of 3 numbers : " + result2);
    }

}