package Queue;
import java.util.*;
public class deQueImp {

    public static void main(String [] args){
        Deque<Integer> d=new ArrayDeque<>();

//        d.addFirst(4);
//        d.addFirst(7);
//        d.addFirst(9);

        d.addLast(4);
        d.addLast(7);
        d.addLast(9);

        System.out.println("Deque data is:"+d);

       // d.removeLast();
        d.removeFirst();
        System.out.println("Deque data after the deletion"+d);
    }
}
