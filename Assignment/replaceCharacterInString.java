package Assignment;
import java.util.*;

public class replaceCharacterInString {


    public static String replaceChar(String str,char x,char y){

        char [] arr=str.toCharArray();

        if(arr.length ==0){
            return null;
        }

        for(int i=0;i<arr.length;i++){

            if(arr[i]==x){
                arr[i]=y;
            }
            else if(arr[i]==y){
                arr[i]=x;
            }
        }
        return new String(arr);
    }


    public static void main(String [] args){

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the String:");
        String n=sc.next();

        System.out.println("Enter the char:");
        char x=sc.next().charAt(0);
        System.out.println("Enter the char:");
        char y=sc.next().charAt(0);

        String res=replaceChar(n,x,y);
        System.out.println("output is:"+res);

    }

}
