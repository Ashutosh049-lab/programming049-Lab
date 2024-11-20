
import java.util.Scanner;

public class ConvertHMS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Input seconds: ");
        int totalSeconds = sc.nextInt();
        
   
        int hours = totalSeconds / 3600;
        int minutes = (totalSeconds % 3600) / 60;
        int seconds = totalSeconds % 60;
        
        
        System.out.println("There are:");
        System.out.print("H:M:S:-"+hours+":"+minutes+":"+seconds+"");
        
       
    }
}

