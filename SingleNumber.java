// find the single number 
public class SingleNumber {
    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums) {
            result ^= num;
        }
        return result;
    }

    public static void main(String[] args) {
    	
    	SingleNumber sol=new SingleNumber();
        int[] nums1 = {2, 2, 1};
       
        System.out.println(sol.singleNumber(nums1)); // Output: 1
       
    }
}
