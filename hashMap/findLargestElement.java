package hashMap;
import java.util.*;
// T C=O(N logN)
// S C=O(N)

public class findLargestElement {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);

        TreeMap<Integer,Integer> map=new TreeMap<>();

        System.out.println("Enter the no of element :");
        int n=sc.nextInt();

        int [] arr=new int[n];
        System.out.println("Enter the element in  the Array:");

        for(int i=0;i<n;i++){
           arr[i]=sc.nextInt();// data store in the array
            map.put(arr[i],1);  //put the element in the treemap

        }

//        for(int i=0;i<n;i++){
//            map.put(arr[i],1);
//        }

        System.out.println("The largest element is :"+map.lastEntry().getKey());
    }
}
