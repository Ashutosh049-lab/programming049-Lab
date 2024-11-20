import java.util.*;
public class fibonacciSeries {

	public static int fibonacci(int n) {
		int result=0;
		if(n<=1) {
			return n;
		}
		else {
			
			// recursive call
			result= fibonacci(n-1)+fibonacci(n-2);
		}
		return result;
	}
	
	public static void main(String [] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the nth number in fabonacci series");
		int n=sc.nextInt();
		int result=fibonacci(n);
		System.out.println("The result of "+n+" fibonacci number is: "+result);
	}
}
