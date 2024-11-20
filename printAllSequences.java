import java.util.ArrayList;
//import java.util.Arrays;
import java.util.*;
public class printAllSequences {
     public static void printAllSequences(int[]arr,int index,ArrayList<Integer>tempArr) {
    	// base case
    	 if(index==arr.length) {
    		 // print all the sequence-- but do not print empty entries
    		 
    	 
    		 if(tempArr.size()>0) {
    			 System.out.println(tempArr);
    		 }
    		 return;
    	 }
    	 
    		 //recursive call
    		 //include
    		 printAllSequences(arr,index+1,tempArr);
    		 tempArr.add(arr[index]);
    		 
    		 // do not include
    		 printAllSequences(arr,index+1,tempArr);
    		 // remove the value from tempArr-- backTracking
    		 tempArr.remove(tempArr.size()-1);
    }
    	 
     
     
     
     public static void main(String[]args) {
    	 int []arr= {1,2};
    	System.out.println("for the Array-"+ Arrays.toString(arr)); 
    	printAllSequences(arr,0,new ArrayList<Integer>());
     }
}
