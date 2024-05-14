package dataStructures.linkedList;

/**
 * Make the first node of the linkedList linked to the new node
 * Remove the head from the original first node of linkedList
 * Make the new node as the head of linked list
 */

class Node{
    int data;
    Node next; //next element in the list
}

//Class to insert elements in LL
public class Insertion {
    Node head; //first element of the list

    void insertAtFront(int new_data){
        Node new_node = new Node();//allocate node
        new_node.data = new_data; //put in the data
        new_node.next = head; //make the next of new node as head
        head = new_node;
    }

    //Function to remove the first node of LL
    void removeFirstNode(){
        if(head == null)
            return;

        //Move the head pointer to next node
        Node temp = head;
        head = head.next;
    }

    //Function to print the elements of the LL
    void printList(){
        Node node = head;
        while (node != null){
            System.out.println(node.data + " ");
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Insertion list = new Insertion();
        list.insertAtFront(6);
        list.insertAtFront(2);
        list.insertAtFront(4);
        list.insertAtFront(7);
        list.insertAtFront(5);
        list.insertAtFront(9);
        list.insertAtFront(13);
        list.insertAtFront(75);

        System.out.println("After inserting nodes at the front: ");
        list.printList();
        list.removeFirstNode();
        System.out.println("After removing first node: ");
        list.printList();
    }
}
