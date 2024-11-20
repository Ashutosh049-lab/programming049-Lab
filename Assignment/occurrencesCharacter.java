package Assignment;
import java.util.*;

public class occurrencesCharacter {

    public static String replacing(String s){

        char[] arr=s.toCharArray();

        for(int i=0;i<arr.length;i++){

            if(arr[i]=='a'){
                arr[i]='b';
            } else if (arr[i]=='b') {

                arr[i]='a';
            }


        }

        //return Arrays.toString(arr);
        return new String(arr);


    }

    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String:");
        String n= sc.next();

        String res=replacing(n);

        System.out.println("String is: "+res);

    }
}
