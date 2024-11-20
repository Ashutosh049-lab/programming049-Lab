import java.util.*;
public class bubbleSort {
     public static void bubbleSort(int []nums) {
    	 int n= nums.length;
    	 
    	
    	 for (int i = 0; i < n; i++) {
            // boolean flag = false;

             for (int j = 0; j < n -i- 1; j++) // also we can use j <n-1
             {
                 if (nums[j] > nums[j + 1]) {
                  //   flag = true;
                     // swap the values of a[j] and a[j+1]
                     int temp = nums[j];
                     nums[j] = nums[j + 1];
                     nums[j + 1] = temp;
                 }
             }
             // No Swapping happened, array is sorted
//             if (!flag) {
//                 break ;
 //            }
         }
	 
 }
     
     
     public  void main(String []args) {
    	 
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("Enter the number of element in an Array:");
    	 int n=sc.nextInt();
    	 
    	 int []nums=new int[n];
    	 
    	 System.out.println("Enter the element in an Array:");
    	 for(int i=0;i<n;i++)
    	 {
    		nums[i]=sc.nextInt();
    	 }
    	 
    	bubbleSort(nums);	 
    	
    	
    	 System.out.println("Sorted Array is :");
    		System.out.println(Arrays.toString(nums));
    	
     }
}
