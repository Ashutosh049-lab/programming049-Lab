package Assignment;
import java.util.*;

public class countStockMarketDecreased {

    public static int countDecreasing(int [] arr){

        int count =0;
        int ele=arr[0];

        for(int i=1;i<arr.length;i++){



            if(ele > arr[i]){
                count++;
            }
            ele=arr[i];
        }

        return count;
    }

    public static void main(String [] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the no. of element in an array:");
        int n=sc.nextInt();

        int [] arr=new int [n];
        System.out.println("Enter the element in an array:");

        for(int i=0;i<n;i++){

           arr[i]=sc.nextInt();

        }

        int res=countDecreasing(arr);
        System.out.println("output is:"+res);


    }


}
