import java.util.*;
public class validParenthesis {
    
	public static boolean isValid(String str) {
	// create a character array and convert string to Char
		char[]chars=str.toCharArray();
		
		Stack<Character> stack1=new Stack<>();
		
		for(char ele:chars) {
			if(ele=='('||ele=='{'||ele=='[') {
				stack1.push(ele);
				continue;
			}
			else if(stack1.empty()) {
				return false;
			}
			char top=stack1.pop() ;
			// if there is no mapping
			if(top=='['&&ele!=']') {
				return false;
				
			}else if(top=='('&&ele!=')') {
				return false;
			}else if(top=='{'&&ele!='}') {
				return false;
			}
		}
		return(stack1.empty()==true);
		
	}
	

	public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the String:-");
	String str=sc.nextLine();
	
	
	System.out.println("Is the string contyains valid parenthesis ?"+isValid(str));
	
	}
}
