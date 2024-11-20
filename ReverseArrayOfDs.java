import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;



public class ReverseArrayOfDs {

	 /*
     * Complete the 'reverseArray' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static List<Integer> reverseArray(List<Integer> a) {
    // Write your code here
    List<Integer> reversedArray = new ArrayList<>();
        
        // Reverse the array and add elements to reversedArray
        for (int i = a.size() - 1; i >= 0; i--) {
            reversedArray.add(a.get(i));
        }

        return reversedArray;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
       System.out.println("Enter the size of ArrayList:");
        // Read the size of the array
        int n = in.nextInt();

        // Read the array elements
        List<Integer> arr = new ArrayList<>();
        System.out.println("Enter the element of ArrayList:-");
        for (int i = 0; i < n; i++) {
            arr.add(in.nextInt());
        }

        // Call the reverseArray function
        List<Integer> reversedArray = reverseArray(arr);

        // Print the reversed array
        System.out.println("Reverse element of Array:-");
        for (int i = 0; i < n; i++) {
            System.out.print(reversedArray.get(i) + " ");
        }

       

    }
}
