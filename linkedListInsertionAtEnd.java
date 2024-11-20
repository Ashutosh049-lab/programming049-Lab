import java.util.LinkedList;
public class linkedListInsertionAtEnd {

// Node head;
// 
// class Node {
//	 int data;
//	 Node next;
//	 
//	 Node(int d){
//		 data=d;
//		 next=null;
//		 
//		 
//	 }
// }
// 
// // insert the node at the very end in the linked list 
// public  void insertAtEnd(int newData) {	
//	Node newNode = new Node(newData);
//	
//	// linkedList is empty 
//	if(head==null) {
//		head=new Node(newData);
//		return;
//	}
//	
//	// linked list is not empty
//	newNode.next=null;
//	// traversing the linkedlist at the end of the node
//	Node temp=head;
//	while(temp.next!=null) {
//		temp=temp.next;
//	}
//	
//	temp.next = newNode;
//	return;
// }
//// display all the nodes after the insertion
// public  void printNodes() {
//	 Node current= head;
//	 while(current!=null) {
//		System.out.print(current.data+" "); 
//		current=current.next; 
//	 }
// }
// 
// public static void main(String []args) {
//	 linkedListInsertionAtEnd list=new linkedListInsertionAtEnd();
//	 
//	 // function calling
//	 list.insertAtEnd(2);
//	 list.insertAtEnd(4);
//	 list.insertAtEnd(8);
//	 list.insertAtEnd(10);
//	 
//	 System.out.println("Linked List after successful insertio of all the nodes:- ");
//	 list.printNodes();
//	 System.out.println();
// }
	
	Node head;

    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

	public void insertAtEnd(int newData) {
		Node newNode=new Node(newData);
		
		// if linkedList is empty
		if(head==null) {
			head=new Node(newData);
			//Node temp=temp.next;
			return;
		}
		// if linkedList is not empty
		newNode.next=null;
		
		Node temp=head;
		
		while(temp.next!=null) {
			temp=temp.next;
			
		}
		temp.next=newNode;
		return;
		
	}
	
	// insertion at the beginning in a linkedList
	public void insertionAtBeginning(int newData) {
		Node newNode=new Node(newData);
	     newNode.next=head;
		head=newNode;

	}
	
	// insertion at the any location
	
	public void insertionAtAnyLocation(Node prev_node,int newData){ 
	
		if(prev_node==null) {
			System.out.println("The previous node cannot contain the null value");
			return;
		}
		Node newNode=new Node(newData);
		newNode.next=prev_node.next;
		prev_node.next=newNode;
	
		
	}
	
	
	// implementation of Deletion of a node in the linkedList
	public void deleteNode(int position) {
		// linked list is empty
		if(head==null) {
			return;
		}
		Node temp=head;
		// deletion from the beginning
		if(position==0) {
			head=temp.next;
			return;
		}
		
		// deletion from the other any location
		for(int i=0;temp!=null&& i<position-1;i++) {
			temp=temp.next;
		}
		if(temp==null&&temp.next==null) {
			return;
		}
		temp.next=temp.next.next;
	}
	
	
	// Implementation of reversal of linkedList using an iterative approch
	public void reversalLL() {
		Node curr=head;
		Node prev=null;
		Node next=null;
		
		while(curr!=null) {
			
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		head=prev;
	}
	
	
	
	// implementation of reversal of a linkedList using a recursive code
//	public void reversalRec(Node curr, Node prev){
//        // last node of the linked list
//        if(curr.next == null){
//            head = curr;
//            curr.next = prev;
//            return;
//        }
//
//        Node nextPtr = curr.next;
//        curr.next = prev;
//        // recursion concept
//        reversalRec(nextPtr, curr);
//    }
//
//	
	
	// implementation of finding out the middle node in a linked list
	public void middleNode() {
		
		Node slow=head;
		Node fast=head;
		
		while(fast!=null&&fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
		}
System.out.println("\nMiddle data of a given linkedList is:- "+slow.data);
	}
	// implementation of finding out the cycle in a linked list
	//floy's cycle detected
	public void detectLoop() { 
		Node slow=head;
		Node fast=head;
		int flag=0;
		while(slow!=null&&fast!=null&&fast.next!=null) {
			slow=slow.next;
			fast=fast.next.next;
	if(slow==fast) {		
		flag=1;
		break;
	       }
		}
		if(flag==0) {
			System.out.println("no loop detected");
		}else {
			System.out.println("loop is detected");
		}
	}
	
	public void printNodes() {
		Node current=head;
		
	while(current !=null) {
		System.out.print(current.data+" ");
		current=current.next;
	}
	}
	
	public static void main(String[]args) {
linkedListInsertionAtEnd list=new linkedListInsertionAtEnd();
		
		// function calling
		list.insertAtEnd(2);
		list.insertAtEnd(4);
		list.insertAtEnd(8);
		list.insertAtEnd(10);
		list.insertAtEnd(11);
		
// inert at the beginning
list.insertionAtBeginning(1);
		
System.out.println("LinkedList after successful insertion of all the nodes:-");
list.printNodes();
System.out.println();
	
System.out.println("linkedList insert at the any location");
list.insertionAtAnyLocation(list.head.next.next, 6);
list.printNodes();
System.out.println("\nafter the Delete node :-");
	
list.deleteNode(3);
list.printNodes();
	
list.reversalLL();
System.out.println("\nReversal LinkedList from the iterative method");
list.printNodes();
	
//	list.reversalRecur(list.head,null);
//	System.out.println("\nReversal LinkedList from the Recursive method");
//	list.printNodes();
	
	list.middleNode();
	// circular linkedlist
	Node temp=list.head;
	while(temp.next!=null) {
		temp=temp.next;
	}
	temp.next=list.head;
	list.detectLoop();
	System.out.println();
	}
}
