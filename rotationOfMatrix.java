import java.io.*;
import java.util.*;
public class rotationOfMatrix {
    public static void rotatedMatrix(int[][]arr) {
   
    	//step1-transpose the 2D Array
      for(int i=0;i<arr.length;i++)
      {
    	  for(int j=i;j<arr[0].length;j++)
    	  {
    		int temp =arr[i][j];
    		arr[i][j]=arr[j][i];
    		arr[j][i]=temp;
    	  }
      }
      
   //step2-swap the left and right side columns
      for(int i=0;i<arr.length;i++)
      {
    	  int li=0;  //li=left index
    	  int ri=arr.length-1;
    	  while(li<ri) {
    		  int temp=arr[i][li];
    		  arr[i][li]=arr[i][ri];
      		arr[i][ri]=temp;
    	  
    	  li++;
    	  ri--;
         }
      }
    
   }
    
	public static void main(String[] args) {
		int arr[][]= {
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12},
				{13,14,15,16}
		};
	// function calling
	rotatedMatrix(arr);
	
	//display
	for(var mat:arr) {
	System.out.println(Arrays.toString(mat));
	    }
	
	}

}
