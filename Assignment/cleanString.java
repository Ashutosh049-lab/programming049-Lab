package Assignment;
import java.util.*;

public class cleanString {

    public static String clean(String str1,String str2){

        HashMap<Character,Integer> map=new HashMap<>();

        for(char i:str1.toCharArray()){

            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(char i:str2.toCharArray()){

            if(map.containsKey(i)){
                map.remove(i);
            }
        }

        StringBuilder result=new StringBuilder();
        for(char i:str1.toCharArray()){

            if(map.containsKey(i)){
                result.append(i);
            }
        }


        if(result.isEmpty()){
            return "Empty";
        }


         return result.toString();

    }



    public static void main(String [] args){

        Scanner sc=new Scanner (System.in);

        System.out.println("Enter the alphabet input1:-");
        String n=sc.next();
        System.out.println("Enter the alphabet input2:-");
        String m=sc.next();

        String r=clean(n,m);
        System.out.println("output is: "+r);





    }

}
