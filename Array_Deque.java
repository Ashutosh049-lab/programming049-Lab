import java.util.*;
import java.util.ArrayDeque;
public class Array_Deque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayDeque ad1= new ArrayDeque();
	    
		ad1.add(10);
		ad1.add(20);
		ad1.add(30);
		ad1.add("pw");
		
		System.out.println(ad1);
		ad1.addFirst(100);
		ad1.addLast(200);
		
		System.out.println(ad1);
		
		ad1.offer(500);
		ad1.offerFirst(200);
		ad1.offerLast(800);
		
		System.out.println(ad1);
		
	}

}
