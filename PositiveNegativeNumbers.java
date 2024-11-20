
import java.util.Scanner;

public class PositiveNegativeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int positiveCount = 0;
        int negativeCount = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Input the " + ordinalNumber(i) + " number: ");
            int number = sc.nextInt();

            if (number > 0) {
                positiveCount++;
            } else if (number < 0) {
                negativeCount++;
            }
        }

        System.out.println("Number of positive numbers: " + positiveCount);
        System.out.println("Number of negative numbers: " + negativeCount);

    
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
