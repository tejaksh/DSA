import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();

        linkedList.offer("A");
        linkedList.offer("B");
        linkedList.offer("C");
        linkedList.offer("D");
        linkedList.offer("F");

        linkedList.add(4,"E"); // add "E" at 4th index & "F" will be shifted at 5th index

        System.out.println(linkedList.peekFirst()); //fetch 1st element of list
        System.out.println(linkedList.peekLast()); //fetch last element of list
        linkedList.addFirst("0"); //add element at head of list
        linkedList.addLast("G"); // add element at tail of list

        System.out.println("Before Removing " + linkedList);

        String first = linkedList.removeFirst(); //remove first element of list
        String last = linkedList.removeLast(); //remove last element of list

        System.out.println("After Removing " + linkedList);
    }
}
