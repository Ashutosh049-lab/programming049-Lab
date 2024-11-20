
// t.c=o(n),s.c=o(1);
import java.util.*;
public class selectionSort {
   public static void selectionSort(int []nums) {
	   int n=nums.length;
	   
	   for(int i=0;i<n;i++)
	   {
		   // min idx is responsible to store the index of min value in every iteration
		   int min_idx=i;
		   for(int j=i+1;j<n;j++)
		   {
			 if(nums[j]<nums[min_idx])
			 {
				 min_idx=j;
			 }
		   }
		  if(min_idx!=i)
		  {
			  int temp=nums[min_idx];
			  nums[min_idx]=nums[i];
			  nums[i]=temp;
			  
		  }
	   }
   }
   
   public static void main(String [] args) {
	   Scanner sc= new Scanner(System.in);
	   System.out.println("Enter the no of element in Array:-");
	   int n=sc.nextInt();
	   int []num=new int[n];
	   System.out.println("Enter the element in Array:-");
	   for(int i=0;i<n;i++)
	   {
		   num[i]=sc.nextInt();
	   }
	   selectionSort(num);
	   System.out.println("sorted Array is :-");
	   System.out.println(Arrays.toString(num));
	   
   }
}
