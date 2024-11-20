package LinkedList;

public class intersectionOfTwoLinkedList {        // tc=O(max(O+N)) and sc=O(1)
//    public int lengthL(ListNode head){
//        int count=0;
//        while(head !=null){
//            head=head.next;
//            count++;
//        }
//        return count;
//    }
//    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//        int lA=lengthL(headA); //l=length
//        int lB=lengthL(headB);
//        int diff=0;
//        ListNode cA=null; // c=current
//        ListNode cB=null;
//
//        if(lA>lB){
//            cA=headA;
//            cB=headB;
//            diff=lA-lB;
//        }else{
//            cA=headB;
//            cB=headA;
//            diff=lB-lA;
//        }
//
//        while(diff !=0){
//            cA=cA.next;
//            diff--;
//        }
//
//        while(cA !=null && cB !=null){
//            if(cA==cB){
//                return cA;// or cB
//            }
//
//            cA=cA.next;
//            cB=cB.next;
//        }
//
//        return null; // if there is cod not excuteted and program has ended
//    }
}










//import java.util.Scanner;
//
//public class Main {
//    // Definition for singly-linked list.
//    static class ListNode {
//        int val;
//        ListNode next;
//        ListNode(int x) {
//            val = x;
//            next = null;
//        }
//    }
//
//    // Definition of intersectionOfTwoLinkedList class
//    static class intersectionOfTwoLinkedList {
//        public int lengthL(ListNode head){
//            int count=0;
//            while(head !=null){
//                head=head.next;
//                count++;
//            }
//            return count;
//        }
//        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
//            int lA=lengthL(headA); //l=length
//            int lB=lengthL(headB);
//            int diff=0;
//            ListNode cA=null; // c=current
//            ListNode cB=null;
//
//            if(lA>lB){
//                cA=headA;
//                cB=headB;
//                diff=lA-lB;
//            }else{
//                cA=headB;
//                cB=headA;
//                diff=lB-lA;
//            }
//
//            while(diff !=0){
//                cA=cA.next;
//                diff--;
//            }
//
//            while(cA !=null && cB !=null){
//                if(cA==cB){
//                    return cA;// or cB
//                }
//
//                cA=cA.next;
//                cB=cB.next;
//            }
//
//            return null; // if there is cod not excuteted and program has ended
//        }
//    }
//
//    // Main function
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        // Input for first linked list
//        System.out.println("Enter elements of the first linked list (separated by space):");
//        String[] listAElements = scanner.nextLine().split(" ");
//        ListNode headA = createLinkedList(listAElements);
//
//        // Input for second linked list
//        System.out.println("Enter elements of the second linked list (separated by space):");
//        String[] listBElements = scanner.nextLine().split(" ");
//        ListNode headB = createLinkedList(listBElements);
//
//        // Creating an instance of intersectionOfTwoLinkedList class
//        intersectionOfTwoLinkedList intersectionFinder = new intersectionOfTwoLinkedList();
//
//        // Finding the intersection node
//        ListNode intersectionNode = intersectionFinder.getIntersectionNode(headA, headB);
//
//        // Output
//        if (intersectionNode != null) {
//            System.out.println("Intersection node value: " + intersectionNode.val);
//        } else {
//            System.out.println("There is no intersection node.");
//        }
//    }
//
//    // Helper method to create a linked list from an array of elements
//    private static ListNode createLinkedList(String[] elements) {
//        ListNode dummy = new ListNode(0);
//        ListNode current = dummy;
//        for (String element : elements) {
//            current.next = new ListNode(Integer.parseInt(element));
//            current = current.next;
//        }
//        return dummy.next;
//    }
//}
//
