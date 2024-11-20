package Queue;
import java.util.*;
public class queueImplementation {

    public static void main(String [] args){
        Queue<Integer> q=new LinkedList<>();
       // to insert the data in the queue -enqueue

       for(int i=0;i<10;i++){
           q.add(i);
       }

       System.out.println("Queue looks like:"+q);

       // to print the topMost element in the queue
        System.out.println("Top Most element in the queue:"+q.peek());

        // the size of the current queue
        System.out.println("Size of the queue:"+q.size());

        // to remove the element from the queue
        q.remove();

        // to print the topMost element in the queue
        System.out.println("Top Most element in the queue after the deletion:"+q.peek());


        // the size of the current queue
        System.out.println("Size of the queue after the deletion:"+q.size());



    }

}
