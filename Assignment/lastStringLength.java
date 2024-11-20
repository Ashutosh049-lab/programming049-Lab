package Assignment;
import java.util.*;

public class lastStringLength {

    public static int StringLength(String str){

        str=str.trim();
        int count=0;

        for(int i=0;i<str.length()-1;i++){

            if(str.charAt(i)==' '){
                count=0;
            }else{
                count++;
            }
        }

        return count;
    }



    public static void main(String [] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc.nextLine();

        System.out.println(StringLength(str));
    }
}
