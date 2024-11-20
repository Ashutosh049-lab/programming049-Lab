import java.util.*;

public class map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     HashMap hm=new HashMap();
     hm.put(01,"Rohan");//entry
     hm.put(02,"Rohit");
     hm.put(03,"Rahul");
     System.out.println(hm);
     
     HashMap hm1=new HashMap();
     hm1.put("virat","Rohan");//entry
     hm1.put("Rohit","Rohit");
     hm1.put("Hyder","Rahul");
     System.out.println(hm1);//but output do not give the insertion order because is follow HashMap algorithm ,if you want to see in order then use LinkedHashmap
	
     LinkedHashMap lhm1=new LinkedHashMap();
     lhm1.put("virat","Rohan");//entry
     lhm1.put("Rohit","Rohit");
     lhm1.put("Hyder","Rahul");
     System.out.println(lhm1);
	}

}
