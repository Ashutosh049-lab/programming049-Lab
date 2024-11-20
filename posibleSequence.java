import java.util.ArrayList;
import java.util.Arrays;
public class posibleSequence {
	public static void sequence(int []arr,int index,ArrayList<Integer>tempArr) {
		
		// base case condition
		if(index==arr.length) {
			// print all the sequences-- but do not print entries
			if(tempArr.size()>0) {
			System.out.println(tempArr);
			}
			return;
		}
			// recursive call
			//include
			sequence(arr,index+1,tempArr);
			tempArr.add(arr[index]);
			
			//do not include
			sequence(arr,index+1,tempArr);
			//remove the value from tempArr--Backtracking
			tempArr.remove(tempArr.size()-1);
		
	}
	
	
	
	
	
	
  public static void main(String []args) {
	 int []arr= {1,2};
	 System.out.println("for the Array-"+Arrays.toString(arr));
	 sequence(arr,0,new ArrayList<Integer>());
  }
}
