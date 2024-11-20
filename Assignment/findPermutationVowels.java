package Assignment;
import java.util.*;

public class findPermutationVowels {

    public static boolean isVowels(char c){

          c=Character.toLowerCase(c);
            return c=='a' || c=='e'||c=='i'||c=='o'||c=='u';

    }


    public static int factorial(int n) {
            if (n == 0 || n == 1) return 1;
            return n * factorial(n - 1);

    }


    public static int permutation(String str){
      List<Character> mp=new ArrayList<>();
        for(char c:str.toCharArray()){

            if(!isVowels(c)){
                mp.add(c);
            }
        }

        int n=mp.size();

        return factorial(n);
    }


    public static void main(String [] args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:");
        String str=sc.next();


        int res=permutation(str);

        System.out.println("output:"+res);
    }


}
