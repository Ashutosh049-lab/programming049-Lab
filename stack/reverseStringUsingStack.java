package stack;
import java.util.*;

public class reverseStringUsingStack {

      public static String reverseString(String str){

          // create char stack
          Stack<Character> st=new Stack<>();

          for(int i=0;i<str.length();i++){
              st.push(str.charAt(i));
          }

          StringBuilder reversed =new StringBuilder();
          // pop
          while(!st.isEmpty()){
             reversed.append(st.pop());
         }


          return reversed.toString();

      }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string to reverse: ");
        String input = scanner.nextLine();

        // Call the reverseString method and print the result
        String reversedString = reverseString(input);
        System.out.println("Reversed string: " + reversedString);


    }


}
