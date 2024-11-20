import java.util.*;
public class insertionSort {
  public static void insertionSort(int []nums) {
	  int n=nums.length;
	 for(int i=1;i<n;i++)
	 {
		 int j=i;
		while(j>0&&nums[j]<nums[j-1])
		{
			int temp=nums[j];
			nums[j]=nums[j-1];
			nums[j-1]=temp;
			j--;
		}
	 }
	 
	  
  }
  
  public static void main (String [] args) {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("Enter the no of Array:-");
	  int n=sc.nextInt();
	  int []nums=new int [n];
	  System.out.println("Enter the element of Array:-");
	  for(int i=0;i<n;i++)
	  {
		  nums[i]=sc.nextInt();
	  }
	  insertionSort(nums);
	  System.out.println("Sorted Array is:- ");
	  System.out.println(Arrays.toString(nums));
  }
}
