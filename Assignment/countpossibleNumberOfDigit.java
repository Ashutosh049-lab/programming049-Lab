package Assignment;
import java.util.*;
public class countpossibleNumberOfDigit {


    public static int countPossible(int n){

        int count=0;

        for(int i=1;i<=n;i++){

            if(!String.valueOf(i).contains("3")){
                count++;
            }
        }
        return count;

    }


    public static void main(String [] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the input:- ");
        int n=sc.nextInt();


        int result=countPossible( n);

        System.out.println("output is: "+result);
    }


}
