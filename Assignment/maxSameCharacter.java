package Assignment;
import java.util.*;

public class maxSameCharacter {

    public static int countCharacter(String str,int k){
      int i=0;
      int j=0;
      int currCount=0;
      int maxCount=0;

      char [] arr=str.toCharArray();

      while(j<k){

          if(arr[j]=='a'){
             currCount++;
          }
          j++;
      }
      maxCount=Math.max(maxCount,currCount);

      while(j<str.length()){

          if(arr[i]=='a'){
             currCount--;
          }
          if(arr[j]=='a'){
              currCount++;
          }
          maxCount=Math.max(maxCount,currCount);
          i++;
          j++;
      }
      return maxCount;

    }

    public static void main(String [] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String:-");
        String n=sc.next();
        System.out.println("Enter the value of K:");
        int k=sc.nextInt();

        int res=countCharacter(n,k);

        System.out.println("output is: "+res);
    }


}
