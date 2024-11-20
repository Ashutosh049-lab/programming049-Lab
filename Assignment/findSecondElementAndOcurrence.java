package Assignment;
import java.util.*;

public class findSecondElementAndOcurrence {



    public static int SecondElementAndOccurrences(int [] arr){

        int max=arr[0];
        int secMax=Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){

            if(arr[i]>max){
                secMax = max;
                max=arr[i];
            }

            if(arr[i]>secMax && arr[i]<max){
                secMax=arr[i];
            }
        }

        int count=0;

        for(int i=0;i<arr.length;i++){

            if(arr[i]==secMax){
                count++;
            }
        }
        return count;

    }

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the no. of element in an Array:");
        int n=sc.nextInt();

        int [] arr=new int[n];
        System.out.println("Enter the element in an Array:");

        for(int i=0;i<n;i++){

            arr[i]=sc.nextInt();
        }

        int res=SecondElementAndOccurrences(arr);

        System.out.println("outPut is:"+res);
    }
}
