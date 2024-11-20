package LinkedList;
import java.util.*;
public class reverseLinkedList {
   static Node head;
   static class Node{
        int data;
        Node next;

        Node(int d){
            data=d;
            next=null;
        }

    }
// insert data at end
    public static void insert(int newData){
        Node newNode=new Node(newData);
        if(head==null){
            head=new Node(newData);
            return;
        }
        newNode.next=null;
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newNode;
        return;

    }
    public static void printNodes() {
        Node curr=head;

        while(curr !=null) {
            System.out.print(curr.data+" ");
            curr=curr.next;
        }
    }


    public static void reverseList(){
        Node curr=head;
        Node prev=null;
        Node next=null;

        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        head=prev;
    }

    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the linked list:");
        int n = sc.nextInt();
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            insert(data);
        }
        reverseList();
        System.out.println("Original LinkedList:");
        printNodes();
       // reverseList();
        System.out.println("\nReversed LinkedList:");
        printNodes();
    }


}






