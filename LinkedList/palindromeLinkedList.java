package LinkedList;
import java.util.*;

class PalindromeLinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    public boolean isPalindrome() {
        List<Integer> list = new ArrayList<>();
        Node curr=head;
        while(curr !=null){
            list.add(curr.data);
            curr=curr.next;
        }
        // two pointer
        int low=0;
        int high=list.size()-1;
        while(low<high){
            if(list.get(low).equals(list.get(high))){
                low=low+1;
                high=high-1;
            }else{
                return false;
            }
        }
        return true;

    }
    public void insert(int newData) {
        Node newNode = new Node(newData);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = null;
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    public void printNodes() {
        Node curr = head;
        while (curr != null) {
            System.out.println(" " + curr.data);
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        PalindromeLinkedList list = new PalindromeLinkedList();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            int data = sc.nextInt();
            list.insert(data);
        }

        System.out.print("Original LinkedList:");
        list.printNodes();

        if (list.isPalindrome()) {
            System.out.println("\nThe LinkedList is a palindrome.");
        } else {
            System.out.println("\nThe LinkedList is not a palindrome.");
        }
    }
}
