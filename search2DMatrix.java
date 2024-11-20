import java.util.*;
public class search2DMatrix {
    public static boolean searchMatrix(int [][]matrix,int target) {
    	// m is no of row
    	int m=matrix.length;
    	
    	// base case condition
    	if(m==0) {
    		return false;
    	}
    	// number of column
    	int n=matrix[0].length;
    	
    	// binary search algorithm
    	
    	int low=0;
    	int high=m*n-1;  // find max ind value in matrix
    	int midIdx,midElement,rowIdx,colIdx;
    	while(low<=high) {
    		 midIdx=low+(high-low)/2;
    	      rowIdx=midIdx/n;
    	      colIdx=midIdx%n;
    	      midElement=matrix[rowIdx][colIdx];
    		 
    		if(midElement==target) {
    			return true;
    		}
    		else {
    			if(midElement>target) {
    			high=midIdx-1;
    			
    		    }
    			else {
    				low=midIdx+1;
    			}
    		}
    	}
    	return false ;// if not found
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns in the matrix:");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        
        System.out.println("Enter the target element to search:");
        int target = sc.nextInt();

        boolean result = searchMatrix(matrix, target);

        if (result) {
            System.out.println("Target element " + target + " is found in the matrix.");
            
        } else {
            System.out.println("Target element " + target + " is not found in the matrix.");
        }
    }
}
