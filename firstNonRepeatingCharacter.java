import java.util.*;
public class firstNonRepeatingCharacter {
//	public static void firstnonRepeating(String str) {
//		HashMap<Character,Integer> map=new HashMap<>();
//		
//		for(int i=0;i<str.length();i++) {
//			if(map.containsKey(str.charAt(i))) {
//			 map.put(str.charAt(i),map.get(str.charAt(i))+1);
//			 
//			}else {
//				map.put(str.charAt(i),1);
//			}
//		}
//		
//		int result=-1;
//		for(int i=0;i<str.length();i++) {
//			if(map.get(str.charAt(i))==1) {
//				System.out.println("The first non repeating character at index is:"+i);
//				result=1;
//				break;
//			}
//		}
//		if(result==-1) {
//			System.out.println("non repeating character present inside the string");
//		}
//	}
//	
//	
    public static void main(String[]args) {
    	Scanner sc=new Scanner(System.in);
    	System.out.println("Enter the String");
    	String str=sc. nextLine();
      HashMap<Character,Integer> map=new HashMap<>();
		
		for(int i=0;i<str.length();i++) {
			if(map.containsKey(str.charAt(i))) {
			 map.put(str.charAt(i),map.get(str.charAt(i))+1);
			 
			}else {
				map.put(str.charAt(i),1);
			}
		}
		
		int result=-1;
		for(int i=0;i<str.length();i++) {
			if(map.get(str.charAt(i))==1) {
				System.out.println("The first non repeating character at index is:"+i);
				result=1;
				break;
			}
		}
		if(result==-1) {
			System.out.println("non repeating character present inside the string");
		}
	}
	
    	
    
}
