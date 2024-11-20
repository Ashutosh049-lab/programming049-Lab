package Assignment;

public class largestNuberDivisibleBy90 {

    public static void Divisible(int[] arr, int n) {

        int count0 = 0;
        int count5 = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                count0++;
            } else {
                count5++;
            }
        }

        if (count0 == 0) {
            System.out.print("-1");

        }
        if (count5 == 0) {
            System.out.print("0");
        }

        count5 = (int) Math.floor(count5 / 9) * 9;

        for (int i = 0; i < count5; i++) {
            System.out.print("5");
        }

        for (int i = 0; i < count0; i++) {
            System.out.print("0");
        }
    }


    public static void main(String[] args) {


    int[] arr = {5, 5, 5, 5, 5, 5, 5, 5, 5, 0, 5};
    int n = 11;

    Divisible(arr, n);
   }

}
