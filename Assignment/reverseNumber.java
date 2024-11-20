package Assignment;
import java.util.*;

public class reverseNumber {

    public static int reverse(int n){

        int rev=0;

        while(n !=0){

            int rem=n%10;
            rev=rev*10+rem;
            n=n/10;
        }

        return rev;
    }


    public static void main(String [] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        int result = reverse(n);
        System.out.println("output is:" + result);
    }

}
