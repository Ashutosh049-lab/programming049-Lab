package Assignment;
import java.util.*;

public class findOddEven {

    public static String oddEven(int [] arr){

        if(arr.length==0){
            return null;
        }

        String str="";

        for(int i=0;i<arr.length;i++){

            if(arr[i]%2==0){
                str+=("Even");
            }else{
                str+="Odd";
            }
        }
        return str;
    }


    public static void main(String [] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no. element in an array:");
        int n=sc.nextInt();

        System.out.println("Enter the element int an array:");
        int [] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        String res=oddEven(arr);

        System.out.println("output is:-"+res);
    }

}
