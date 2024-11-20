
import java.util.Scanner;

public class month {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input a number between 1 to 12 to get the month name: ");
        int monthNumber = sc.nextInt();

       
        if (monthNumber >= 1 && monthNumber <= 12) {
            String[] months = {
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
            };

            
            String monthName = months[monthNumber - 1];
            System.out.println(monthName);
        } else {
            System.out.println("Invalid input. Please enter a number between 1 and 12.");
        }

       
    }
}
