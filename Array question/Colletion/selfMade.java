package Colletion;

import java.util.Iterator;
public class selfMade {
    public static void main(String[] args) {
        String[] name = {"taqdish", "talib","anshu","arsalan","saif"};
        nameContainer container = new nameContainer(name);
        Iterator<String> it = container.iterator();
//        while(it.hasNext()){
//            System.out.print(it.next()+" ");
//        }
        //Enhance Forloop / for each loop
        for(String naam : container){
            System.out.println(naam);
        }
    }
}
class nameContainer implements Iterable<String> {
    private String[] names;
    private int size;

    nameContainer(String[] names){
        this.names= names;
        this.size = this.names.length;
    }
    public Iterator<String> iterator(){
        return  new nameContainerIterator();
    }

    private class nameContainerIterator implements Iterator<String>{
        int position = 0;

        @Override
        public boolean hasNext() {
            return position<size;
        }
        @Override
        public String next() {
            return names[position++];
        }
    }
}
