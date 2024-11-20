
// find first and last position of element in sorted Array


import java.util.*;
public class findFirstAndLastPositionOfElement {
 public static int[] searchRange(int []arr,int target) {
	 int []result= {-1,-1};
	 int first=search(arr,target,true);
	 int last=search(arr,target,false);
	 
	result[0]=first;
	result[1]=last;
	
	return result;
	
 }
 
 static int search(int []arr,int target,boolean findFirstIndex) {
	 int low=0;
	 int high=arr.length-1;
	 int result=-1;
	 
	 while(low<=high) {
		 int mid=low+(high-low)/2;
		 
		 if(arr[mid]==target) {
			 result=mid;
			 if(findFirstIndex) {
				 high=mid-1;
			 }
			 else {
				 low=mid+1;
			 } 
		 }
		 else if(arr[mid]>target) {
			 high=mid-1;
		 }
		 else {
			 low=mid+1;
		 }
		 
	 }
	 return result;
 }
 
 public static void main(String [] args ) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter no of element in an Array:-");
	 int n=sc.nextInt();
	 
	 int []nums=new int [n];
	 System.out.println("Enter the element in an Array:- ");
	 for(int i=0;i<n;i++) {
		 nums[i]=sc.nextInt();
	 }
	 System.out.println("which element you want to target:-");
	 int target=sc.nextInt();
	 
	 
	int[] result= searchRange(nums,target);
	
	

	
	System.out.println("______________");
	
	System.out.println("Array element:-");
	 System.out.println(Arrays.toString(nums));
	 
	 if (result[0] != -1) {
	System.out.println("outPut["+result[0]+","+result[1]+"]");
	 } else {
         System.out.println("Target value not found in the array.");
     }
	}
 }

