package Assignment;
import java.util.*;

public class largestNumber {



    public static int largest(int [] arr){

        int max=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){

            int ele=arr[i];

            if(ele>max){
                max=ele;
            }
        }

        return max;
    }

    public static void main(String [] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of element: ");
        int n=sc.nextInt();

        int [] arr=new int[n];

        System.out.println("Enter the element:");
        for(int i=0;i<n;i++){

            arr[i]=sc.nextInt();
        }

        int res=largest(arr);
        System.out.println("output is:"+res);

    }

}
