package Colletion;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    static void main() {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(3);
        list.add(40);
        list.add(5);
        list.add(60);
        list.add(7);
        list.add(80);
        list.add(9);
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){
            Integer val = it.next();
            System.out.println(val + " ");
            System.out.println(it.hasNext());
            if(val%2==0){
                it.remove();
            }
        }
        System.out.println();
        //direct list update ho raha loop ke andar hi
        System.out.println(list);
    }
}
