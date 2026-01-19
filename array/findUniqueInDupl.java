import java.util.Arrays;

public class findUniqueInDupl {
    public static void main(String[] args) {
        int[] a = { 1, 1, 1, 2, 2, 3 };
        int off = 0;
        int unique = 1;
        int cm = 1;
        while (cm < a.length) {
            if (a[cm] == a[cm - 1]) {
                cm++;
                continue;
            }
            a[off + 1] = a[cm];
            off++;
            unique++;
            cm++;
            // a[1,2,3,2,2,3]

        }

        System.out.println("no of unique element are : " + unique);
        System.out.print("unique element is : ");
        for (int i = 0; i < unique; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        System.out.println("a" + Arrays.toString(a));
    }
}
