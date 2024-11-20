package hashMap;
import java.util.*;
// T C=O(N)
// S C=O(N)

public class detectDuplicateData {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no of element:");
        int n=sc.nextInt();
        int []arr=new int[n];

        HashMap<Integer,Integer> map=new HashMap<>();

         System.out.println("Enter the element in the Array:");

         for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
         }

         boolean duplicate=false;

        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                duplicate=true;
                System.out.println("yes");
                break;
            }
            map.put(arr[i],1);
        }
        if(duplicate==false){
          System.out.println("No") ;
        }
    }
}
