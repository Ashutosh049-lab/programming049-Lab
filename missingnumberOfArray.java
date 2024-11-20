
public class missingnumberOfArray {

	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5,6,8,9};
		int n=arr.length;
		int sum_natural_numbers=((n+1)*(n+2)/2);
		int sum=0;
		for(int i=0;i<n;i++)
		{
			sum=sum+arr[i];
		}
	int missing_num=sum_natural_numbers-sum;
	System.out.println("Missing number in an Array is:"+missing_num);
		
	}

}
