package Multithreading;

public class GarbageCollectionDemo {
    public void finalize(){
        System.out.println("Object is garbage collected");
    }
    public static void main(String[] args) {
        GarbageCollectionDemo s1 = new GarbageCollectionDemo();
        GarbageCollectionDemo s2 = new GarbageCollectionDemo();

        s1 = null;
        s2 = null;

        System.gc();
    }
}
