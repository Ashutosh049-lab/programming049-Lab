package Assignment;
import java.util.*;

public class DivindendArray {

    public static int divisor(int []arr,int div,int quotient,int rem){

        int formula=quotient*div+rem;

        for(int i=0;i<arr.length;i++){

            if(arr[i]==formula){
                return i;
            }
        }
        return -1;

    }

    public static void main(String [] args){

        Scanner sc=new Scanner (System.in);

        System.out.println("Enter the no. of element in an array:");
        int n=sc.nextInt();

        int[]arr=new int[n];
        System.out.println("Enter the element in an Array:");

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the div:");
        int x= sc.nextInt();

        System.out.println("Enter the quoteint:");
        int y= sc.nextInt();
        System.out.println("Enter the rem:");
        int z= sc.nextInt();

        int res=divisor(arr,x,y,z);
        System.out.println("output is: "+res);
    }

}
