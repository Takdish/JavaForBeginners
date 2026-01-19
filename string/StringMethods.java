package string;

public class StringMethods {
    public static void main(String[] args) {
        String s1 = "this is farhan ";
        String s2 = "deepak";
        String s3 = "faisal";

        System.out.println(s1.replace("is", "was"));
        System.out.println(s1.replaceFirst("is", "was"));
        System.out.println(s1.replaceAll("is(.*)", "was"));
        System.out.println(s1.replaceAll("is(.)", "was"));
        System.out.println(s1.replaceAll("is(.,)", "was")); // treat as a simple string
        System.out.println(s2.lastIndexOf('e')); // 2
        System.out.println(s2.indexOf('e')); // 1
        System.out.println(s3.lastIndexOf('a'));// 4
        System.out.println(s3.indexOf('a'));// 1
        String s4 = "Takdish";
        System.out.print(s4.charAt(0));// t
        System.out.print(" " + s4.charAt(1));// a
        System.out.print(" " + s4.charAt(2));// k
        System.out.print(" " + s4.charAt(3));// d
        System.out.print(" " + s4.charAt(4));// i
        System.out.print(" " + s4.charAt(5));// s
        System.out.print(" " + s4.charAt(6));// h
        System.out.println();
        for (int i = 0; i < s4.length(); i++) {
            System.out.print(s4.charAt(i) + " ");// h
        }
        System.out.println("\n" + s4.contains("ak")); // true
    }
}
