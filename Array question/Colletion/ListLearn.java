package Colletion;
import java.util.*;

public class ListLearn {
    static void main() {
        Scanner sc= new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        System.out.print("Enter size : ");
        int n = sc.nextInt();
        for(int i =0; i<n; i++){
            System.out.print("Enter element : ");
            list.add(sc.nextInt());
        }
        System.out.println(list);
//        System.out.println(list.getFirst());
//        list.set(0,5);
//        System.out.println(list);

        ListIterator<Integer> it = list.listIterator(list.size());
        while(it.hasPrevious()){
            System.out.print(it.previous() + " ");
        }

    }
}
