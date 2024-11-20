package Assignment;
import java.util.*;
public class DeleteString {
    public static String convert(String str, int l,int h){
        String ans="";
        for(int i=0;i<str.length();i++){
            if(i<l ){
                ans=ans+str.charAt(i);
            }
            if( i>=h){
                ans=ans+str.charAt(i);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        System.out.println(convert("Ashutosh",3,5));
    }
}
