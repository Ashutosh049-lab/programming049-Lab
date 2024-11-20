package Assignment;

public class squareRootOfEvenAndOdd {

      public static int squareRoot(int m,int n){

          int evensum=0;
          int oddsum=0;

          for(int i=m;i<=n;i++){

              int square=(int)Math.sqrt(i);
             if(i%2==0) {
                 evensum = evensum+ square;
             }else{
                 oddsum=oddsum+square;
             }
          }

          return evensum-oddsum;
      }

      public static void main(String [] args){

          int m=1;
          int n=10;
         int result= squareRoot(m,n) ;

         System.out.println("sum of square root: "+result);


      }


}
