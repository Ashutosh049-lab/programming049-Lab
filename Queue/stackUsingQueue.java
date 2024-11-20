package Queue;
// T C add:O(n)
// T C remove:O(1)
// S C add:O(n)

import java.util.*;
public class stackUsingQueue {

    static Queue<Integer> q1=new LinkedList<>();
    static Queue<Integer> q2=new LinkedList<>();

    // add element in the stack
    // time complexity:O(n)
    static void add(int data){
        // 1. mave all the data element from q1 to q2
        while(!q1.isEmpty()){
            q2.add(q1.peek());
            q1.poll();
        }

        //2. insert the new data in q1
        q1.add(data);

        // move back all the data elements from q2 to q1
        while(!q2.isEmpty()){
            q1.add(q2.peek());
            q2.poll();
        }
    }

    // to remove the element from the stack
    // time complexity=O(1)
    static int remove(){
        if(q1.isEmpty()){
          System.out.println("Stack is underflow");
          System.exit(0);
        }
        int ele=q1.peek();
        q1.poll();
        return ele;

    }



    public static void main(String []args){
        stackUsingQueue s=new stackUsingQueue();

        s.add(2);
        s.add(5);
        s.add(7);
        s.add(10);

        // pop the element from the stack
        System.out.println("Deleted element is:"+s.remove());
        System.out.println("Deleted element is:"+s.remove());
    }
}
