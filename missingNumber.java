// find missing number using the function in the range of sequence


public class missingNumber {
    public int MissingNumber(int[] nums) {
        int n = nums.length;
        int SumNums = (n * (n + 1)) / 2;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum = sum + nums[i];
        }

        int MissingNums = SumNums - sum;
        return MissingNums;
    }

    public static void main(String[] args) {
    	missingNumber sol = new missingNumber(); // Create an instance of the Solution class
        int[] nums = {0,3,  1};

        System.out.println(sol.MissingNumber(nums));
    }
}

