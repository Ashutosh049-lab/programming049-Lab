import java.util.Scanner;

public class DayToYearMonthDay {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.print(" no. of days: ");
        int totalDays = sc.nextInt();

        
        int years = totalDays / 365;
        int remainingDays = totalDays % 365;
        int months = remainingDays / 30;
        int days = remainingDays % 30;


        System.out.println(years + " Year(s)");
        System.out.println(months + " Month(s)");
        System.out.println(days + " Day(s)");

       
    }
}
