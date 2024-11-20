package Assignment;
import java.util.*;

public class targetElement {

    public static int find(int [] arr,int target){

        int l=0;



        int r=arr.length;

        while(l < r){

            int mid=l + (r-l)/2;

            if(arr[mid] > target){
                r=mid-1;
            }
            else if(arr[mid]==target){
                return mid;
            }else{
                l=mid+1;
            }
        }

        return l;
    }

    public static void main(String [] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the no of element:");
        int n=sc.nextInt();

        int [] arr=new int[n];
        System.out.println("Enter the element:");

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println("Target value:");
        int target=sc.nextInt();

        int res= find(arr,target);

        System.out.println("output is[index at]: "+res);


    }


}
