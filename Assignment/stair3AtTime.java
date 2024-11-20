package Assignment;
import java.util.*;

public class stair3AtTime {

    public static int count(int [] arr){
         int count=0;
        for(int i=0;i<arr.length;i++){

            if(arr[i]%3==0){
                count++;
            }
        }
        return count;


    }



    public static void main(String [] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the no.of element an array:");
        int n=sc.nextInt();

        int [] arr=new int[n];

        System.out.println("Enter the element in an array:");
        for(int i=0;i<n;i++){

            arr[i]=sc.nextInt();

        }

        int res=count(arr);
        System.out.println("output is:"+res);

    }

}
