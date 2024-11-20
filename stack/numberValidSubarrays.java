package stack;
import java.util.*;

public class numberValidSubarrays {

    public static int validSubarrays(int arr[]){

        int res=0;
        Stack<Integer> st=new Stack<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            while(!st.isEmpty()&& arr[st.peek()]>arr[i]){

                res+=i-st.pop();

            }
            st.push(i);
        }

        while(!st.isEmpty()){
            res+=n-st.pop();
        }
      //  System.out.println(res);
        return res;

    }




    public static void main(String []args){
      //  Scanner sc=new Scanner (System.in);
        int []arr={3,2,1};

        System.out.println(validSubarrays( arr));
    }
}
