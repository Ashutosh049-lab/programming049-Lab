package hashMap;
import java.util.*;

public class hashMapFunction {
 public static void main(String []args) {
	HashMap<Integer,String> map=new HashMap<>();
	 
	 // put() function
	 map.put(1,"Ashu");
	 map.put(0,"Kumar");
	 map.put(7,"Jaiswal");
	 map.put(9,"Anshu");
	 System.out.println("Hashmap of given data is:-"+map);
	 
	 // get() function
	String result= map.get(2);
	System.out.println("the value of given key is:- "+result);
	
	// remove() function
	map.remove(1);
	System.out.println("updated Hashmap is:-"+map);
	
	// containsKey() function
	System.out.println("Checking of whether key is present or not:-"+map.containsKey(9));// it is give the output in the form of true or false
	
	// entrySet() function
	// iterating using the for loop
	
	for(Map.Entry<Integer, String> ele: map.entrySet()){
       // System.out.println("Hashmap is: ");
        System.out.println(ele.getKey() + " : " + ele.getValue());
	}
 }
}
