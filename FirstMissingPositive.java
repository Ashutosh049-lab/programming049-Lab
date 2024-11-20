
//  find first positive number 

class FirstMissingPositive  {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        for(int i=0;i<n;i++)
        {
            if(nums[i]<=0)
            {
                nums[i]=(n+1);
            }
        }

        
        for(int i=0;i<n;i++)
        {
          int index = Math.abs(nums[i]);
            if (index <= n) {
                nums[index - 1] = -Math.abs(nums[index - 1]);
            }
        }


       for(int i=0;i<n;i++) 
       {
           if(nums[i]>0)
           {
               return i+1;
           }
       }
       
     //  if you have all positive number then return simply
          return n+1;
    }
    
    public static void main(String [] args){
    	FirstMissingPositive sol= new FirstMissingPositive();
        int []nums1={3,4,-1,1};
        System.out.println(sol.firstMissingPositive(nums1));
    }
    
} 