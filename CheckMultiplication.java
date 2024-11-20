import java.util.Scanner;

public class CheckMultiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print(" the first number: ");
        int num1 = sc.nextInt();

  
        System.out.print(" the second number: ");
        int num2 = sc.nextInt();

        
        if (num1 % num2 == 0 || num2 % num1 == 0) {
            System.out.println("Multiplied!");
        } else {
            System.out.println("Not Multiplied!");
        }

       
    }
}

