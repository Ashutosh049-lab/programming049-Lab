package DivideAndConquere;
import java.util.Arrays;

public class inversionCount {

    public static int inversionCount(int []arr,int n){


        // brute force approach
      int count=0;
        for(int i=0;i<n;i++){

            for(int j=i+1;j<n;j++){

                if( arr[i]>arr[j]){
                    count++;
                }
            }
        }
        return count;
    }


    // merge procedure
    public static int mergeProcedure(int [] arr,int l,int mid,int h){

        int swap=0;
        // taken the extra space -O(n)
        int [] lsubarray=Arrays.copyOfRange(arr,l,mid+1);
        int [] rsubarray=Arrays.copyOfRange(arr,mid+1,h+1);

        int i=0,j=0,k=l;
        while(i<lsubarray.length && j<rsubarray.length){

            if(lsubarray[i]<=rsubarray[j]){
                arr[k++]= lsubarray[i++];
//                 i=i+1;

            } else{
                arr[k++]=rsubarray[j++];

                swap+=(mid+1)-(l+i);

            }
        }
        while(i<lsubarray.length){
            arr[k++]=lsubarray[i++];
        }

        while(j<rsubarray.length){
            arr[k++]=rsubarray[j++];

        }
        return swap;
    }


    // function definition of counting of number of inversion via Divide and Conquer Approach
   public static int inversionCountOpt(int[]arr,int l,int h) {
       int count = 0;

       if (l < h) {
           // divide the array into subproblem
           int mid = l + (h - l) / 2;
           // conquer the subproblems via the concept of recursion
           count += inversionCountOpt(arr, l, mid); // left subarray
           count += inversionCountOpt(arr, mid + 1, h);// right

           // combine the result of left and right subArray to get the final solution
           count += mergeProcedure(arr, l, mid, h);


       }
       return count;
   }




    public static void main(String [] args){

        int [] arr={70,50,60,10,20,30,80,15};
        int n=arr.length;

        int [] arr1={5,4,3,2,1};
        int m=arr1.length;



//        int count=inversionCount(arr,n);
        int count=inversionCount(arr1,m);
        System.out.println("the inversion count of given array using brute force is : "+count);


//        int countOpt=inversionCountOpt(arr,0,n-1);
        int countOpt=inversionCountOpt(arr1,0,m-1);
        System.out.println("The inversion count of given array using divide and conquer is:- "+countOpt);
    }
}
