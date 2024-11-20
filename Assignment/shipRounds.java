package Assignment;
import  java.util.*;
public class shipRounds {

      public static int ship(int n,int m){

          if(m%n==0){

              return m/n;

          }else{
              return (m/n)+1;

          }

    }

    public static void main(String [] args){

          Scanner sc=new Scanner(System.in);

          System.out.println("Enter the no of capacity:-");
          int n=sc.nextInt();
          System.out.println("Enter the no of people is to be transported:-");
          int m=sc.nextInt();

         int r= ship(n,m);
         System.out.println("output is:"+r);



    }


}
