
public class palindromeProgram {

	public static void main(String[] args) {
		int[]arr= {1,2,3,3,2,1};
		int n=6;
		int flag=0;
		for(int i=0;i<arr.length/2;i++)
		{
			if(arr[i]!=arr[n-i-1])
			{
				flag=1;
				System.out.println("it is not palindrome program");
				break;
			}
			if(flag==0) {
				System.out.println("it is palindrome program");
				break;
				}
			
		}
//		if(flag==0) {
//		System.out.println("it is palindrome program");
//		}
     }

}
