package Assignment;
import java.util.*;

public class checkSumOfLeftRight {

    public static int sumOfLeftRight(int [] arr,int n){

        n=arr.length;

        int leftSum=0;
        int rightSum=0;
        int totalSum=0;

        for(int nums:arr) {

            totalSum +=nums;
        }

        for(int i=0;i<n;i++) {

            rightSum =totalSum-leftSum-arr[i];

            if(leftSum==rightSum){
                return i;
            }

            leftSum +=arr[i];

        }


        return -1;

    }

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the no. of element in an array:");
        int n=sc.nextInt();

        int [] arr=new int [n];
        System.out.println("Enter the element in an array");

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int res=sumOfLeftRight(arr,n);
        System.out.println("output is:"+res);
    }

}
