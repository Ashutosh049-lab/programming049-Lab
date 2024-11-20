package hashMap;
import java.util.*;

public class printDataInSortedOrder2 {
public static void main (String []args){
    Scanner sc=new Scanner(System.in);
    TreeMap<String,Integer> map=new TreeMap<>();
    System.out.println("Enter the no of key and value in pairs:");
    int n=sc.nextInt();
    System.out.println("Enter the value and key:");
    for(int i=0;i<n;i++){
        int Key=sc.nextInt();
        String value=sc.next();
        map.put(value,Key);

    }
    System.out.println("The map is :"+map);



}
}
