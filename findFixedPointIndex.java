import java.util.*;
public class findFixedPointIndex {
	public static int linearSearch(int []arr,int n) {
		
		for(int i=0;i<n;i++) {
			if(arr[i]==i) {
				return i+1; // i=i+1=0+1= 1 ex.(o/p)
			}
		}
		return -1;// if not found
	}
	
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the Array:");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements in the sorted Array:");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        

        int result = linearSearch(arr,n);
        System.out.println("Array: " + Arrays.toString(arr));

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }

}
