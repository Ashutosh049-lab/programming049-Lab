import java.util.Scanner;

public class firstOccurrence {
	
	
	public static int firstOccurrence(int[]arr,int target)
	{
	int low=0,high=arr.length-1;
	int result=-1;
	while(low <=high)
	{
		int mid=low+(high-low)/2;
		
		if(arr[mid]==target)
		{
			 result=mid;
			 
			 //to make sure,we want lower bound of an element,so we need to traverse towards left side of an array
			high=mid-1;
		}
		else if(arr[mid]>target)
		{
		 high=mid-1;	
		}
		else {
			low=mid+1;
		}
	 }
	return result;
	}


	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of element in an Array:");
		int n=sc.nextInt();
		
		System.out.println("Enter the element in an array: ");
		
		
		int[] arr=new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		
		System.out.println("Enter the target value that you want to search for:");
		int target=sc.nextInt();
		
		//function calling
		int result=firstOccurrence(arr,target);
		
		if(result !=-1)
		{
			System.out.println("first occurrence of Element is found at location:"+result);
		}else
		{
			System.out.println("Element is not found");
		}
	}

}
