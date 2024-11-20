
import java.util.Arrays;
import java.util.Scanner;

public class infiniteNumberArray {

    static int findPosition(int[] nums, int target) {
        int low = 0;
        int high = 1;

        // Double the high index until the target is greater than the element at the high index
        while (target > nums[high]) {
            low = high + 1;
            high = high * 2;
        }

        // Perform binary search in the identified range
        return binarySearch(nums, target, low, high);
    }

    static int binarySearch(int[] nums, int target, int low, int high) {
        while (low <= high) {
            int mid = low + (high - low) / 2;
            
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] > target) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return -1; // Element not found
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements in the Array:");
        int n = sc.nextInt();
        int[] nums = new int[n];
        System.out.println("Enter the elements in the sorted Array:");

        for (int i = 0; i < n; i++) {
            nums[i] = sc.nextInt();
        }

        System.out.println("Enter the target value to find:");
        int target = sc.nextInt();

        int result = findPosition(nums, target);
        System.out.println("Array: " + Arrays.toString(nums));

        if (result != -1) {
            System.out.println("Element found at index: " + result);
        } else {
            System.out.println("Element not found in the array.");
        }
    }
}
