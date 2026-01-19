package string;

public class StringBufferMethods {
    public static void main(String[] args) {
        // Create a StringBuffer object
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity()); // Default capacity is 16

        StringBuffer sb1 = new StringBuffer("Hello");
        System.out.println(sb1.capacity());
        /*
         * Capacity is 16 + length of string because initial string is provided we can't
         * use append here
         * if we use append it will increase capacity if length exceed initial
         * capacity
         */

        // we can provide initial capacity also
        StringBuffer sb2 = new StringBuffer(50);
        System.out.println(sb2.capacity()); // Capacity is 50

        sb.append(" World");
        // Capacity is still 16 because length is 6 if we append less than capacity it
        // will not change
        System.out.println(sb.capacity());

        sb1.append("World! Welcome to Java Programming.");
        // Capacity is increased because length exceeded initial capacity
        System.out.println(sb1.capacity()); // New capacity is (old capacity * 2) + 2 // (16*2)+2=34

        StringBuffer sb3 = new StringBuffer("ABCDEFGHIJKLMNOPQRSTUVWXYZ"); // length = 26
        System.out.println(sb3.length()); // Length of the string = 26
        System.out.println(sb3.capacity()); // New capacity is (old capacity * 2) + 2 // (42*2)+2=86
    }
}
