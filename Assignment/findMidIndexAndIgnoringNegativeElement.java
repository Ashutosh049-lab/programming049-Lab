package Assignment;
import java.util.*;

public class findMidIndexAndIgnoringNegativeElement {

    public static int element(int []arr,int n){

      int count =0;
      for(int i=0;i<n;i++){

          if(arr[i]>=0){
              count++;
          }
      }
      if(count ==0){
          return -1;
      }

      int mid=(count-1)/2;
      int nonNegative=0;

              for(int i=0;i<n;i++){

                  if(nonNegative==count){

                   return arr[i];
                  }
                  nonNegative++;
              }

              return -1;

    }

    public static void main(String [] args){
        Scanner sc=new Scanner (System.in);

        System.out.println("Enter the no.of element in an array:");
        int n=sc.nextInt();

        System.out.println("Enter the element in an array");
        int [] arr=new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int res=element(arr,n);

        System.out.println("output is :"+res);
    }
}
