package LinkedList;
import java.util.*;
class LinkedListTarget {

    static class Node{//user define data type
        int value;
        Node next; //default value null

        Node(int value){
            this.value = value;
        }
    }
    public static void display(Node head){
        Node current  = head;
        while(current!=null){
            System.out.print(current.value + " ");
            current = current.next ;//aage badhao
        }
    }
    public static void remove(Node head, int target){
        Node current  = head;
        int count =1;
        while(count!=target){
            current =current.next;
            count++;
        }
        current.next = current.next.next;


    }
     void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter size : ");
        int size = sc.nextInt();
        System.out.println("Enter 1st : " );
        int k =sc.nextInt();
        Node head = new Node(k);
        Node current = head;
        for(int i =1; i<size; i++){
            System.out.print("Enter the elements : ");

            Node temp = new Node(sc.nextInt());
            current.next = temp; //connect
            current =current.next; //aage badh raha

        }
        current = head;
        System.out.print("The linked list is : ");
        display(head);
        System.out.println();
        System.out.print("Enter the position to remove  : ");
        int p=sc.nextInt();
        if(p==1)
        {
            head=head.next;
        }else{
            remove(head, p-1);
        }

        display(head);
    }

}
