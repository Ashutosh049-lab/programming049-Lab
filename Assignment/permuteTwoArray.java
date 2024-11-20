package Assignment;
import java.util.*;
import java.util.Arrays;

public class permuteTwoArray {

    public static boolean isPosible(int []a,int []b,int k,int n){
        Arrays.sort(a);
        Arrays.sort(b);
        reverse(b);

        for(int i=0;i<n;i++){

            if(a[i]+b[i]>=k){
                return true;
            }
        }
        return false ; // if not equal and greater
    }

    public static void reverse(int [] arr){
        int n=arr.length;

        for(int i=0;i<n/2;i++){

            int temp=arr[i];
            arr[i]=arr[n-1-i];
            arr[n-1-i]=temp;
        }
    }


    public static void main(String [] args){
        int [] a={2,1,3};
        int [] b={7,8,9};
        int k=10;
        int n=a.length;

        if(isPosible(a,b,n,k)){
            System.out.println("yes");
        }else{
            System.out.println("no");
        }


    }
}
