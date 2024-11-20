import java.util.*;
public class TwoSum {
	
	public static int[] twoSum(int arr[],int target) {
		HashMap<Integer,Integer>map=new HashMap<>();
		int n=arr.length;
		for(int i=0;i<n;i++) {
		map.put(arr[i],i );
		}
		int result[]=new int[2];
		
		// if the current element is equal to  the target
	for(int i=0;i<n;i++){
		if(arr[i]==target && map.containsKey(0)) {
			result[0]=i;
			result[1]=map.get(0);
			break;
		}
		 if(map.containsKey(target-arr[i])) {
		  // the element is not repeatable
			if(map.get(target-arr[i])>i) {
				result[0]=i;
				result[1]=map.get(target-arr[i]);
				break;
			}
		}
		
	}
	
	return result;
	
	}
 public static void main(String[]arg) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter the number of element:-");
	 int n=sc.nextInt();
	 System.out.println("Enter the Array elements");
	 int arr[]=new int[n];
	 for(int i=0;i<n;i++) {
		  arr[i]=sc.nextInt();
	 }
	 System.out.println("Enter the Target value");
	 int target=sc.nextInt();
	 
	int result[]= twoSum(arr,target);
	System.out.println("The resultant array is:["+result[0]+","+result[1]+"]");
 }
}
