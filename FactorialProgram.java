import java.util.*;
import java.math.*;
public class FactorialProgram {
  public static BigInteger factorial(int n) {	
	  BigInteger result;
	  // base case condition
	  if(n==0 || n==1) {
		  //return 1 ;
		return  BigInteger.ONE;
	  }
	  else {
		  // result=n*factorial(n-1);
		   result = BigInteger.valueOf(n).multiply(factorial(n - 1));
	  }
	  return result;
  }
  
  public static void main(String []args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the number by the user :-");
	  BigInteger n=sc.nextBigInteger();
	  
	 // BigInteger result=factorial(n);
	  BigInteger result = factorial(n.intValue());

	  
	  System.out.println("factorial of "+n+":- " +result);
		  
	  
  }

}
