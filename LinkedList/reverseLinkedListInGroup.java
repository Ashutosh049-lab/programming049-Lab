package LinkedList;
import java.util.*;
import java.util.LinkedList;
import java.util.Scanner;

public class reverseLinkedListInGroup {

    static Node head;

    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public static void insertAtEnd(int newData) {
        Node newNode = new Node(newData);

        // if linkedList is empty
        if (head == null) {
            head = newNode;
            return;
        }
        // if linkedList is not empty
        newNode.next = null;

        Node temp = head;

        while (temp.next != null) {
            temp = temp.next;

        }
        temp.next = newNode;
        return;

    }

    public static void printNodes() {
        Node curr = head;

        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }
    }

    public static Node reverseInGroup(Node head,int k ) {
       Node curr=head;
       Node prev=null;
       Node next=null;
       int count=0;

       while(count < k&&curr!=null){
           next=curr.next;
           curr.next=prev;
           prev=curr;
           curr=next;
           count++;
       }
        if (next != null) {
            head.next = reverseInGroup(next, k);
        }
       head=prev;
       return head;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the linked list:");
        int n = sc.nextInt();
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            insertAtEnd(data);
        }

        System.out.println("Original LinkedList:");
        printNodes();

        // Reverse in groups of size k
        System.out.println("\nEnter the group size to reverse the linked list k:");
        int k = sc.nextInt();
          head = reverseInGroup( head,k);

        System.out.println("Reversed LinkedList in groups of " + k + ":");
        printNodes();
    }
}
