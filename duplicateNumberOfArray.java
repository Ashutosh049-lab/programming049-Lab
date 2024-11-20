
public class duplicateNumberOfArray {

	public static void main(String[] args) {
		int []arr= {1,2,2,3,3,7};
		int n=arr.length;
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Duplicate number in an Array is:-"+arr[i]);
				}
				
			}
			
		}
	}

}
