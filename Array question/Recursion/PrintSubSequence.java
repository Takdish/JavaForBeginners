package Recursion;
import java.util.*;
public class PrintSubSequence  {
    public static void subset(String empty, String s, int index, ArrayList<String> ans){
        if(index==s.length()){
            ans.add(empty);
            return;
        }
        char ch = s.charAt(index);
        subset(empty+ch, s, index+1, ans); //pick
        subset(empty,s,index+1, ans);
    }
    static void main() {
        String s = "abc";
        ArrayList<String> ans = new ArrayList<>();
        subset("", s,0, ans);
        System.out.print(ans);
    }
}
