
import java.util.LinkedList;


public class Linkedlist 
{
    public static void main(String[] args) 
    {
        LinkedList ll1=new LinkedList();

        ll1.add(100);
        ll1.add(200);
        ll1.add(300);
        

        System.out.println(ll1);
		
		LinkedList ll2=new LinkedList();
		
		ll2.add("pw skill");
		ll2.add(1);
		ll2.add('j');
		
		System.out.println(ll2);
		
		LinkedList ll3= new LinkedList ();
		
		ll3.add(10);
		ll3.add(20);
		ll3.add(30);
		
		System.out.println(ll3);
		
		ll3.addFirst("pw");
		ll3.addLast(1);
		
		System.out.println(ll3);
		
		
		ll3.add(2,400);
		System.out.println(ll3);
		
		System.out.println(ll3.peek());
		System.out.println(ll3);
		
		System.out.println(ll3.poll());
		System.out.println(ll3);
	}

}
