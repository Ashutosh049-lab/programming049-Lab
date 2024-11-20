import java.util.*;
import java.util.PriorityQueue;
public class Priority_Queue {

	public static void main(String[] args) {

	
				// TODO Auto-generated method stub
		   PriorityQueue pq=new PriorityQueue();
		   pq.add(100);
		   pq.add(50);
		   pq.add(150);
		   pq.add(25);
		   pq.add(75);
		   pq.add(125);
		   pq.add(175);
		//   pq.add("pw")
		   
		   System.out.println(pq);//behind the scene work like Mini-heap
		   pq.add(25);//duplicate is allowed
		   System.out.println(pq);
	}

}
