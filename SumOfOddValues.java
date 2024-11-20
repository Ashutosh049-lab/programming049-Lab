
import java.util.Scanner;

public class SumOfOddValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int sumOfOddValues = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Input the " + ordinalNumber(i) + " number: ");
            int number = sc.nextInt();

            if (number % 2 != 0) {
                sumOfOddValues += number;
            }
        }

        System.out.println("Sum of all odd values: " + sumOfOddValues);

        
    }

    public static String ordinalNumber(int num) {
        if (num >= 11 && num <= 13) {
            return num + "th";
        }
        switch (num % 10) {
            case 1:
                return num + "st";
            case 2:
                return num + "nd";
            case 3:
                return num + "rd";
            default:
                return num + "th";
        }
    }
}
