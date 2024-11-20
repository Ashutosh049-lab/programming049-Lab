package hashMap;
import java.util.*;
import java.io.*;
// T C=O(n log N)
// S P=O(n)

public class printDataInSortedOrder {

    public static void main(String [] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of Key-value pairs:");
        int n=sc.nextInt();
       TreeMap<Integer, String> map = new TreeMap<>();
        System.out.println("Enter the key value pairs:");

        for(int i=0;i<n;i++){
            int key=sc.nextInt();
            String value=sc.next();
            map.put(key,value);
        }


        System.out.println("The map is:"+map);

    }

}
