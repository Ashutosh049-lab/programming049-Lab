import java.util.*;


public class BinarySearch {
	
	//function definition
	public static int binarySearch(int[]arr,int target)
	{
	int low=0,high=arr.length-1;
	while(low <=high)
	{
		int mid=low+(high-low)/2;
		
		if(arr[mid]==target)
		{
			return mid;
		}
		else if(arr[mid]<target)
		{
		 low=mid+1;	
		}
		else {
			high=mid-1;
		}
	 }
	return 0;
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
		int result=binarySearch(arr,target);
		
		if(result !=0)
		{
			System.out.println("Element is found at location:"+result);
		}else
		{
			System.out.println("Element is not found");
		}
				
	}

}
