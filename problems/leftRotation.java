package problems;
import java.util.*;

public class leftRotation {

    public static List<Integer> rotateLeft(int d, List<Integer> arr) {

        List<Integer> result=new ArrayList<>(arr);

        // left rotation
        System.out.println("\nleft rotation:-");
        for(int i=0;i<d;i++){
            int first=result.remove(0);
            result.add(first);
        }


        // right rotation

//        System.out.println("\nright rotation:-");
//        for(int i=0;i<d;i++){
//            int last=result.remove(arr.size()-1);
//            result.add(0,last);
//       }
         return result;
    }




    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Reading input values

        System.out.println("Enter the no of element in the array:-");
        int n = scanner.nextInt(); // Number of elements in the array (5)
        System.out.println("Enter the no of rotation in the array:-");
        int d = scanner.nextInt(); // Number of rotations (4)
        List<Integer> arr = new ArrayList<>();

        System.out.println("Enter the  element in the array:-");

        for (int i = 0; i < n; i++) {
            arr.add(scanner.nextInt()); // Reading array elements (1 2 3 4 5)
        }

        // Calling the rotateLeft function and storing the result
        List<Integer> rotatedArr = leftRotation.rotateLeft(d, arr);

        // Printing the rotated array
        for (Integer num : rotatedArr) {
            System.out.print(num + " ");
        }
    }

}
