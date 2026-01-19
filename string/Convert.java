package string;

public class Convert {
    public static void main(String[] args) {
        // convert mutable StringBuffer to immutable String
        StringBuffer sv = new StringBuffer("hello world");
        String s1 = new String(sv);
        System.out.println(s1);

        byte[] b = { 63, 36, 73, 38 };
        String s2 = new String(b);
        System.out.println(s2);
    }
}