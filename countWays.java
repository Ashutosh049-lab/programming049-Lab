import java.util.*;
public class countWays {
   public static int countFind(int n) {
	   
	   if(n<=1) {
		   return n;
	   }
	   else {
		   return countFind(n-1)+countFind(n-2);
	   }
	   
   }
   
   
   public static void main(String []args) {
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the number of stairs by the user :-");
		  int n=sc.nextInt();
		  
		  int result=countFind(n+1);
		  
		  System.out.println("stairs number of way of "+n+":- " +result);
			  
		  
	  }

}
