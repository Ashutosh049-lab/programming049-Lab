import java.util.*;
public class ImplOf2DArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows in an Array:- ");
		int m=sc.nextInt();
		
		System.out.println("Enter the the number of columns in an Array:- ");
		int n=sc.nextInt();
		
		//Declaration of 2D Array
		int arr[][]=new int[m][n];
		
		for(int i=0;i<m;i++)
		{
		   for(int j=0;j<n;j++)
		   {
			arr[i][j]=10;
		    }
		}
		
	// for print the  element	
		for(int i=0;i<m;i++)
		{
		   for(int j=0;j<n;j++)
		   {
			System.out.print(arr[i][j]+" ");
			//System.out.println();
		    }
		   System.out.println();
		}
		System.out.println();
	}

}
