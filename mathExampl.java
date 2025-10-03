
/*Standard Library Method.. 
 There are Three Type of STM;
 1) print(); 
 2) Math.sqrt(); = to give Squart root of any number from Math library:
 3) Math.floor(double a); =  It "rounds down" to the nearest whole number. eg:- 5.9 =5.0, 5.1=5.0:
 4) Math.ceil(double b); =  It "rounds up" to the nearest whole number. eg:- 5.9=6.0, 5.1=6.0:
 5) The Math.max(x,y) method can be used to find the highest value of x and y: 
 6) The Math.min(x,y) method can be used to find the minimum value of x and y: 
 7) The Math.abs(x) method returns the absolute (positive) value of x: 
 8) Math.random() returns a random number between 0.0 (inclusive), and 1.0:
*/
public class mathExampl {

    public static void main(String[] args) {
        int a = 55, b = 66, c = 77, d = 7921;
        System.out.println(Math.max(a, Math.max(b, Math.max(c, d))));
        System.out.println(Math.max(21, 32));
        System.out.println(Math.min(21, 32));
        System.out.println(Math.sqrt(64));
        System.out.println(Math.abs(-345));

        // Math.floor(double a); = It "rounds down" to the nearest whole number. eg:-
        // 5.9 =5.0, 5.1=5.0
        System.out.println(Math.floor(56.53272));

        // Math.ceil(double b); = It "rounds up" to the nearest whole number. eg:-
        // 5.9=6.0, 5.1=6.0
        System.out.println(Math.ceil(56.53272));

        // Math.random() returns a random number between 0.0 (inclusive), and 1.0
        // (exclusive):
        System.out.println(Math.random());

        /*
         * To get more control over the random number, for example,
         * if you only want a random number between 0 and 100, you can use the following
         * formula:
         */
        int randomNum = (int) (Math.random() * 101); // 0 to 100
        System.out.print(randomNum);
    }

}
