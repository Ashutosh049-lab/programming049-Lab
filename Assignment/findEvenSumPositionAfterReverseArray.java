package Assignment;
import java.util.*;

public class findEvenSumPositionAfterReverseArray {

    public static int[] reverse(int [] arr){

        for(int i=0;i<arr.length/2;i++){
            int temp=arr[i];
            arr[i]=arr[arr.length-1-i];
            arr[arr.length-1-i]=temp;
        }
        return arr;
    }

    public static int sumOfEvenPosition(int [] arr){
        arr=  reverse(arr);
        int sum=0;
        for(int i=0;i<arr.length;i++){

            if(i%2==0){
                sum +=arr[i];
            }
        }

        return sum;
    }


    public static void main(String [] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. element in an array:");
        int n=sc.nextInt();

        int [] arr=new int [n];
        System.out.println("Enter the element in an Array:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

//        reverse(arr);
        int res=sumOfEvenPosition(arr);

        System.out.println("output is:"+res);

    }
}
