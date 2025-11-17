package Method;

//not using function
public class primeORnot_2 {
    public static void main(String[] args) {
        // Boolean isPrime = true;
        for (int i = 2; i < 10; i++) {
            Boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime == false) {
                System.out.println("not prime " + i);
            } else {
                System.out.println("prime " + i);
            }
        }
    }
}
