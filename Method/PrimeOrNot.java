package Method;

public class PrimeOrNot {
    static Boolean check(int n) {
        Boolean flag = true;
        for (int i = 2; i < n; i++) {
            if (i == 0 || i == 1) {

            }
            if (n % i == 0) {
                flag = false;
                break;
            }

        }
        if (flag == false) {
            System.out.println("not a prime " + n);
        } else {
            System.out.println("prime " + n);
        }
        return flag;

    }

    public static void main(String[] args) {
        for (int i = 0; i < 25; i++) {
            check(i);
        }
    }
}
