import java.util.HashMap;
import java.util.Scanner;

public class StringPair {
    static void main() {
        Scanner sc = new Scanner(System.in);
        HashMap<Integer, String> map = new HashMap<>();
        String[] word = {"one","two","three","four","five","six","seven","eight","nine","ten"};

        for(int i =1; i<=10;i++){
            map.put(i,word[i-1]);
        }

        System.out.print("Enter size : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter Array Element : ");
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        int d = 0;
        //check vowel
        for(int i =0; i<size; i++){
            String  s = map.get(arr[i]);
            for(int j = 0; j<s.length(); j++){
                char ch = s.charAt(j);

                if(ch=='a' || ch=='e' ||ch=='i' || ch=='o' ||ch=='u'){
                    d++;
                }
            }
        }

        int count = 0;
        for(int i = 0;i<size; i++){
            for(int j = i+1; j<size; j++){
                if(arr[i]+arr[j]==d){
                    count++;
                }
            }
        }
        System.out.println(d);
        String[] result = {"zero","one","two","three","four","five","six","seven","eight","nine","ten"};
        if(count>10){
            System.out.println("greater 10");
        }else{
            System.out.println(result[count]);
        }
    }
}
