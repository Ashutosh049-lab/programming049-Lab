import java.util.*;
public class LinearSearch {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number of element in an Array:");
	int n=sc.nextInt();
	
	System.out.println("enter the elements in an Array");
	
	int [] arr=new int[n];
	for(int i=0;i<n;i++)
	{
		arr[i]=sc.nextInt();
	}
	
	System.out.println("Enter the target value that you want to search for:");
	int target=sc.nextInt();
	
	//implementation of Linear Search Algorithm
	int index=-1;
	for(int i=0;i<n;i++)
	{
		if(arr[i]==target)
		{
		index=i;
		break;
		}
	}
	
	
	if(index ==-1)
	{
		System.out.println("Element is not found in an Array.");
	}else
	{
	   System.out.println("Element is present at the location:"+index);	
	}
	
	
	}

}
