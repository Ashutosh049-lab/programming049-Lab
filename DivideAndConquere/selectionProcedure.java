package DivideAndConquere;

public class selectionProcedure {

    public static int partition(int [] arr,int l,int h){
        int pivot=arr[l];
        int i=l;
        for(int j=i+1;j<=h;j++){

            if(arr[j]<=pivot){
                i=i+1;
                // swapping i and j
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        // swapping l and i
        int temp=arr[l];
        arr[l]=arr[i];
        arr[i]=temp;

        // return  the index of the pivot element
        return i;

    }

    public static int selection(int []arr,int l,int h,int k){


            int mid=partition(arr,l,h);

            if(mid==k-1){
                return arr[mid];
            }
            else if(mid<k-1){
                return selection(arr,mid+1,h,k);
            } else{
                return selection(arr,l,mid-1,k);
            }


    }




    public static void main(String[] args){
        int [] arr={50,30,70,90,10,34,89,98,13};
        int n=arr.length;
        int k=3;

      int result=  selection(arr,0,n-1,k);

      System.out.println("Kth smallest value:- "+result);

    }
}
