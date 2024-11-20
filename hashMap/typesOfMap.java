package hashMap;
import java.util.*;
public class typesOfMap {
	
public static void main(String[]args) {
	//unordered
	HashMap<Integer,String> map=new HashMap<>();
	map.put(4,"priya");
	map.put(2,"shivam");
	map.put(9,"Rahul");
	map.put(1,"chiku");
	
	System.out.println("HashMap class map output is:"+map);
	// order of insertion is preserved
	LinkedHashMap<Integer,String> map1=new LinkedHashMap<>();
	map1.put(4,"priya");
	map1.put(2,"shivam");
	map1.put(9,"Rahul");
	map1.put(1,"chiku");
	
	System.out.println("HashMap class map output is:"+map1);
//treemap- sort the data on the bases of key	
	TreeMap<Integer,String> map2=new TreeMap<>();
	map2.put(4,"priya");
	map2.put(2,"shivam");
	map2.put(9,"Rahul");
	map2.put(1,"chiku");
	
	System.out.println("HashMap class map output is:"+map);
	
}
}
