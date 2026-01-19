package string;

public class GarbageCollectionExample {
    public static void main(String[] args) {
        GarbageCollectionExample T = new GarbageCollectionExample();
        T = null;
        System.gc();
        System.out.println("Requesting garbage collection...");
    }
}
