// google,Flipkart,facebook

import java.util.*;
public class rotatedSortedArray {
   public static int search(int []nums,int target) {
	   int low=0;
	   int high=nums.length-1;
	   
	   while(low<=high) {
		   int mid=low+(high-low)/2;
		   
		   if(nums[mid]==target) {
			   return mid;
			   
		   }
		   
		  //if check Sorted Array in the left side  
		   if(nums[low]<=nums[mid]) {
			   
			// find the target valve in left side of sorted Array   
			   if(nums[low]<= target && target<=nums [mid])
			   {
				   high=mid-1;
			   }else {  
				   
				   low=mid+1;
			   }
			   }else {
				   
				   // else is:-if check Sorted Array in the left side  
				   
				   
				  // find the target valve in right side of sorted Array 
				   if(nums[mid]<=target && target<=nums[high])
				   {
					   low=mid+1;
				   }else {
					   high=mid-1;
				   }
			   
		   }
	   }
	   return -1;// if not found
	   
   }
   
   public static void main(String [] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter the no of element in an Array:-");
	   int n=sc.nextInt();
	   int []nums=new int [n];
	   System.out.println("Enter the element in an Array:-");
	   
	   for(int i=0;i<n;i++) {
		   nums[i]=sc.nextInt();
		   
	   }
	   System.out.println("search target value:-");
	   int target=sc.nextInt();
	   
	   int result=search(nums,target);
	   System.out.println("Array:- "+Arrays.toString(nums));
	   
	   if(result!=-1) {
		   System.out.println("element found at index: "+result);
	   }else {
		   System.out.println("element not found at index.");
	   }
		   
	   
   }
}
