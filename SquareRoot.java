import java.util.*;
import java.io.*;
public class SquareRoot {
    
	public static int squareRoot(int num)
	{
		int low=0,high=num,result=-1;
		//int mid=low+(high-low)/2;
		while(low <= high)
		{
		int mid=low+(high-low)/2;
		long val=mid*mid;
		if(val==num)
		{
			// perfect Square
			return mid;
			
		}
		else if(val< num)
		{
			// store the mid as we need to report the floor value in case of non perfect square root of the given number
		    result=mid;
		    // Right side of an Array
			low=mid+1;
		}
		else 
		{
			// left side of an Array
			high=mid-1;
		}
		}
	       return result ;
	}
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number whose Square root are looking for:");
	int  num=sc.nextInt();
	//function calling
	int result= squareRoot(num);
	System.out.println("the Square root of given number is :"+result);

	
	}

}
