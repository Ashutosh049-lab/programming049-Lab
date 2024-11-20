import java.util.*;
public class stackImplementation {
	
   public static void main(String []args) {
	   Stack<Integer> stack1=new Stack<>();
	   
	   // insert the element inside the stack
	   stack1.push(2);
	   stack1.push(4);
	   stack1.push(6);
	   stack1.push(7);
	   
	   // i want to display top element in the stack
	   System.out.println("The top most element in the stack:"+stack1.peek());
	   
	   // delete the element from the stack
	   stack1.pop();
	   // then again display the top most element from the stack
	
	   System.out.println("The top most element in the stack:"+stack1.peek());
	   
	   // i want 2-search element from the stack
	   System.out.println("Two element search at position:"+stack1.search(2));
	   // if there is not available element in the stack,then search method return -1
	   System.out.println("1 element search at position:"+stack1.search(1));
	   
	   //  whether the stack is empty or not
	   System.out.println("Is the stack is empty or not:"+stack1.empty());
	   
   }
}
