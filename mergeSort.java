// space complexity- O(n)

public class mergeSort {
	
	public static void mergeProcedure(int[] arr, int l, int mid, int r) {
		int i, j, k;
		int n1 = mid - l + 1; // n1-size of left subarray
		int n2 = r - (mid + 1) + 1; // n2-size of right subarray
		
		// create a left and right subarray
		int[] lsubarray = new int[n1];
		int[] rsubarray = new int[n2];
		
		// copy the element into left and right subarray
		for (i = 0; i < n1; i++) {
			lsubarray[i] = arr[l + i];
		}
		for (j = 0; j < n2; j++) {
			rsubarray[j] = arr[mid + 1 + j];
		}
		
		// comparison among element in the left and right subarray
		i = 0;
		j = 0;
		k = l;
		
		while (i < n1 && j < n2) {
			if (lsubarray[i] <= rsubarray[j]) {
				arr[k] = lsubarray[i];
				i = i + 1;
			} else {
				arr[k] = rsubarray[j];
				j = j + 1;
			}
			k = k + 1;
		}
		
		// copy the remaining elements from left
		while (i < n1) {
			arr[k] = lsubarray[i];
			i = i + 1;
			k = k + 1;
		}
		
		// copy the remaining elements from right
		while (j < n2) {
			arr[k] = rsubarray[j];
			j = j + 1;
			k = k + 1;
		}
	}
   
	public static void mergeSort(int[] arr, int l, int r) {
		if (l < r) {
			// divide 
			int mid = l + (r - l) / 2;
			// Conquer the subproblem via the recursive
			mergeSort(arr, l, mid); // left side
			mergeSort(arr, mid + 1, r); // right side
			// combine - merge sort
			mergeProcedure(arr, l, mid, r);
		}
	}
   
   public static void main(String [] args) {
	   int []arr= {50,20,40,90,11,13};
	  // int n=arr.length;
	   System.out.println("Array before sort is :");
	  
	   
	   for (int i = 0; i < arr.length; i++) {
	        System.out.print(arr[i] + " ");
	    }
	    
	    System.out.println();
	   
	   mergeSort(arr,0,arr.length-1);
	   System.out.println("Array after sort is:");
	   for (int i = 0; i < arr.length; i++) {
	        System.out.print(arr[i] + " ");
	    }
   }
}
