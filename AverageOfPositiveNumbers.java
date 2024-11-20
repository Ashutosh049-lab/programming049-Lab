
import java.util.Scanner;

public class AverageOfPositiveNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int positiveCount = 0;
        double positiveSum = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Input the " + ordinalNumber(i) + " number: ");
            double number = sc.nextDouble();

            if (number > 0) {
                positiveCount++;
                positiveSum += number;
            }
        }

        if (positiveCount > 0) {
            double average = positiveSum / positiveCount;
            System.out.println("Number of positive numbers: " + positiveCount);
            System.out.printf("Average value of the said positive numbers: %.2f%n", average);
        } else {
            System.out.println("No positive numbers were entered.");
        }

      
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
