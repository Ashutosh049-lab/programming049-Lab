package Assignment;

public class largestSumSubarray {

    public static int LargestSum(int [] arr,int n){

        int sum=0;
        int max=Integer.MIN_VALUE;

        for(int i=0;i<n;i++){

            sum=sum+arr[i];



//            if(sum>max) {
               max = Math.max(max, sum);
//            }

            if(sum<0){
                sum=0;
            }
        }


        return max;

    }

    public static void main(String [] args){

        int [] arr={-2,1,-3,4,-1,2,1,-5,4};
        int n=arr.length;

        int result=LargestSum(arr,n);

        System.out.println("Sum is:"+result);
    }

}
